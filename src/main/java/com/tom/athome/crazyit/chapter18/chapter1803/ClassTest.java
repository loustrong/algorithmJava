package com.tom.athome.crazyit.chapter18.chapter1803;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * ClassTest
 *
 * @author Tom on 2021/1/30
 */
@Repeatable(Annos.class)
@interface Anno{}
@Retention(value= RetentionPolicy.RUNTIME)
@interface  Annos{
    Anno[] value();
}
@SuppressWarnings(value="unchecked")
@Deprecated
@Anno
@Anno
public class ClassTest {
    // 定义一个无参构造器
    private ClassTest(){}
    // 定义一个有参数的构造器
    public ClassTest(String name){
        System.out.println("执行有参数的构造器");
    }
    // 定义一个无参数的info方法
    public void info(){
        System.out.println("执行无参的info方法");
    }
    public void info(String str){
        System.out.println("执行一个有参数的构造方法" + "其值为:" +
                str);
    }
    class Inner{}

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class<ClassTest> clazz = ClassTest.class;
        Constructor[] ctors = clazz.getDeclaredConstructors();
        System.out.println("ClassTest全部的构造器如下:");
        for (Constructor c: ctors
             ) {
            System.out.println(c);
        }
        // 获取Class对象所对应类的全部public构造器
        Constructor[] publicCtors = clazz.getConstructors();
        System.out.println("ClassTest的全部public构造器如下:");
        for(Constructor c: publicCtors){
            System.out.println(c);
        }
        Method[] mtds = clazz.getMethods();
        System.out.println("ClassTest全部的public方法如下:");
        for (Method md: mtds
             ) {
            System.out.println(md);
        }
        System.out.println("ClassTest里面方法带字符串info的方法为:" + clazz.getMethod("info", String.class));
        System.out.println("-----------------------------------------------------------------");
        Annotation[] anns = clazz.getAnnotations();
        System.out.println("ClassTest的全部Annotation如下:");
        for(Annotation an: anns){
            System.out.println(an);
        }
        System.out.println("该class类上的@SuppressWarning的注解为:" +
                Arrays.toString(clazz.getAnnotationsByType(SuppressWarnings.class)));
        System.out.println("该class类上的@Anno的注解为:" +
                Arrays.toString(clazz.getAnnotationsByType(Anno.class)));
        Class<?>[] inners = clazz.getDeclaredClasses();
        System.out.println("ClassTest的全部内部类如下:");
        for(Class c: inners){
            System.out.println(c);
        }
        // 使用Class.forName()方法加载ClassTest的Inner类
        Class inClazz = Class.forName("com.tom.athome.crazyit.chapter18.chapter1803.ClassTest$Inner");
        // 通过getDeclaredClass()访问该类所在的外部类
        System.out.println("inClazz对应的外部类为:" + inClazz.getDeclaredClasses());
        System.out.println("ClassTes的包为:" + clazz.getPackage());
        System.out.println("ClassTest的父类为:" + clazz.getSuperclass());
    }


}
