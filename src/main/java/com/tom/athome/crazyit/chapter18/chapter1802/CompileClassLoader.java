package com.tom.athome.crazyit.chapter18.chapter1802;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;

/**
 * CompileClassLoader
 *
 * @author Tom on 2021/1/29
 */
public class CompileClassLoader extends ClassLoader{
    private byte[] getBytes(String filename) throws IOException {
        File file = new File(filename);
        long len = file.length();
        byte[] raw = new byte[(int)len];
        try(
                FileInputStream fin = new FileInputStream(file)
                ){
            int r  = fin.read(raw);
            if(r != len) throw new IOException("无法读取全部的文件:" +
                    + r + " != " + len);
            return raw;
        }
    }
    private boolean compile(String javaFile) throws IOException {
        System.out.println("CompileClassLoader:正在编译 "
                +javaFile +"...");
        Process p = Runtime.getRuntime().exec("javac " + javaFile);
        try{
            p.waitFor();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        int ret = p.exitValue();
        return ret == 0;
    }

    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = null;
        String fileStub = name.replace(".", "/");
        String javaFilename = fileStub + ".java";
        String classFilename = fileStub + ".class";
        File javaFile = new File(javaFilename);
        File classFile = new File(classFilename);
        // 当指定Java源文件存在,且Class文件不存在,或者Java源文件
        // 的修改时间比Class文件的修改时间更晚时,重新编译
        if(javaFile.exists() && (!classFile.exists() || javaFile.lastModified() > classFile.lastModified())){
            try{
                //如果编译失败,或者该Class文件不存在
                if(!compile(javaFilename)|| !classFile.exists()){
                    throw new ClassNotFoundException(
                            "ClassNotFoundException:" + javaFilename
                    );
                }
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }
        if(classFile.exists()){
            try{
                byte[] raw = getBytes(classFilename);
                clazz = defineClass(name, raw, 0, raw.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 如果clazz为null,表明加载失败,则抛出异常
        if(clazz == null){
            throw new ClassNotFoundException(name);
        }
        return clazz;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (args.length < 1) {
            System.out.println("缺少目标类,请按照如下格式运行Java源文件");
            System.out.println("java CompileClassLoader ClassName");
        }
        String progClass = args[0];
        // 剩下的参数将作为运行目标类时的参数
        // 将这些参数复制到一个新数组
        String[] progArgs = new String[args.length - 1];
        System.arraycopy(args, 1, progArgs,0,progArgs.length);
        CompileClassLoader ccl = new CompileClassLoader();
        // 加载需要运行的类
        Class<?> clazz = ccl.loadClass(progClass);
        // 获取运行的主方法
        Method main = clazz.getMethod("main",(new String[0]).getClass());
        Object argsArray[] = {progArgs};
        main.invoke(null, argsArray);
    }
}
