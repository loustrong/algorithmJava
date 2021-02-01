package com.tom.athome.crazyit.chapter18.chapter1805;

import java.lang.reflect.Proxy;

/**
 * MyProxyFactory
 *
 * @author Tom on 2021/1/31
 */
public class MyDogProxyFactory {
    public static Object getProxy(Object target){
        MyDogInvocationHandler handler = new MyDogInvocationHandler();
        handler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),handler);
    }

}
