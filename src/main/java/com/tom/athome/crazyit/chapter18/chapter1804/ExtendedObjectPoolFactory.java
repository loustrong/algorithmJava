package com.tom.athome.crazyit.chapter18.chapter1804;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ExtendedObjectPoolFactory
 *
 * @author Tom on 2021/1/31
 */
public class ExtendedObjectPoolFactory {
    private Map<String,Object> objectPool = new HashMap<>();
    private Properties config = new Properties();
    public void init(String fileName){
        try(FileInputStream fis = new FileInputStream(fileName)){
            config.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private Object createObject(String clazzName) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(clazzName);
        // 使用clazz对应类的默认构造器创建实例
        return clazz.getConstructor().newInstance();
    }

    public void initPool() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for(String name: config.stringPropertyNames()){
            if(!name.contains("%")){
                objectPool.put(name,createObject(config.getProperty(name)));
            }
        }
    }
    public void initProperty() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (String name: config.stringPropertyNames()
             ) {
            if(name.contains("%")){
                String[] objAndProp = name.split("%");
                Object target = getObject(objAndProp[0]);
                String mtdName = "set" + objAndProp[1].substring(0,1).toUpperCase()
                        + objAndProp[1].substring(1);
                Class<?> targeClass = target.getClass();
                Method mtd = targeClass.getMethod(mtdName, String.class);
                mtd.invoke(target,config.getProperty(name));
            }
        }
    }

    public Object getObject(String name){
        return objectPool.get(name);
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ExtendedObjectPoolFactory epf = new ExtendedObjectPoolFactory();
        epf.init("extObj.txt");
        epf.initPool();
        epf.initProperty();
        System.out.println(epf.getObject("a"));
    }


}
