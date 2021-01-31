package com.tom.athome.crazyit.chapter18.chapter1804;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * CreateJFrame
 *
 * @author Tom on 2021/1/31
 */
public class CreateJFrame {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> jframeClazz = Class.forName("javax.swing.JFrame");
        Constructor ctor = jframeClazz.getConstructor(String.class);
        Object obj = ctor.newInstance("测试窗口");
        System.out.println(obj);
    }
}
