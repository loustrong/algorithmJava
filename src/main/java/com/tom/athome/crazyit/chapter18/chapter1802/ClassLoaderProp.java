package com.tom.athome.crazyit.chapter18.chapter1802;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * ClassLoaderPropTest
 *
 * @author Tom on 2021/1/29
 */
public class ClassLoaderProp {
    public static void main(String[] args) throws IOException {
        ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统加载器:" + systemLoader);
        /**
         * 获取系统类加载器的加载路径  通常由CLASSPATH环境变量指定
         * 如果操作系统没有指定CLASSPATH环境变量,则默认以当前路径作为
         * 系统类加载器的加载路径
         */
        Enumeration<URL> eml = systemLoader.getResources("");
        while(eml.hasMoreElements()){
            System.out.println(eml.nextElement());
        }
        ClassLoader extensionLoader = systemLoader.getParent();
        System.out.println("扩展类加载器:" + extensionLoader);
        System.out.println("扩展类加载器加载路径:" + System.getProperty("java.ext.dirs"));
        System.out.println("扩展类加载器的parent:" + extensionLoader.getParent());

    }
}
