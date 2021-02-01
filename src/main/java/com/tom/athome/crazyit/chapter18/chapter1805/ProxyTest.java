package com.tom.athome.crazyit.chapter18.chapter1805;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ProxyTest
 *
 * @author Tom on 2021/1/31
 */
public class ProxyTest {
    public static void main(String[] args) {
        InvocationHandler handler = new MyInvokationHandler();
        Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class[]{Person.class}, handler);
        p.walk();
        p.sayHello("孙悟空");
    }
}

interface Person{
    void walk();
    void sayHello(String name);
}
class MyInvokationHandler implements InvocationHandler{
    /**
     * 执行动态代理对象的所有方法时,都会被替换成执行如下的invoke方法
     * @param proxy 代表动态代理对象
     * @param method 代表正在执行的方法
     * @param args 代表调用目标方法时传入的实参
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----正在执行的方法:" + method);
        if(args != null){
            System.out.println("----正在执行的方法:" + method);
            for(Object val : args){
                System.out.println(val);
            }
        } else{
            System.out.println("调用该方法没有实参!");
        }
        return null;
    }
}