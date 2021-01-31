package com.tom.athome.crazyit.chapter18.chapter1805;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MyDogInvocationHandler
 *
 * @author Tom on 2021/1/31
 */
public class MyDogInvocationHandler implements InvocationHandler {
    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtil du = new DogUtil();
        du.method1();
        Object result = method.invoke(target, args);
        du.method2();

        return result;
    }
}
