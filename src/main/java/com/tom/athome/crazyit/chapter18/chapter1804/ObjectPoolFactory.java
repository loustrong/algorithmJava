package com.tom.athome.crazyit.chapter18.chapter1804;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ObjectPoolFactory
 *
 * @author Tom on 2021/1/30
 */
public class ObjectPoolFactory {
    private Map<String, Object> objectPool = new HashMap<>();
    private Object createObject(String clazzName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(clazzName);
        return clazz.getConstructor().newInstance();
    }
    public void initPool(String fileName){
        try(
                FileInputStream fis = new FileInputStream(fileName)
                ){
            Properties props = new Properties();
            props.load(fis);
            for(String name: props.stringPropertyNames()){
                objectPool.put(name, createObject(props.getProperty(name)));
            }
        } catch (IOException e) {
            System.out.println("读取"+ fileName + "异常");
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Object getObject(String name){
        return objectPool.get(name);
    }

    public static void main(String[] args) {
        ObjectPoolFactory pf = new ObjectPoolFactory();
        pf.initPool("obj.txt");
        System.out.println(pf.getObject("a"));
        System.out.println(pf.getObject("b"));
    }
}
