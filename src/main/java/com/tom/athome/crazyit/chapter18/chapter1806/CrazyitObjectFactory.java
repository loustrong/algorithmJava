package com.tom.athome.crazyit.chapter18.chapter1806;

/**
 * CrazyItObjectFactory
 *
 * @author Tom on 2021/1/31
 */
public class CrazyitObjectFactory {
    public static Object getInstance(String clsName){
        try{
            Class cls = Class.forName(clsName);
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
