package com.tom.athome.crazyit.chapter14.chapter1402;

/**
 * FunInterface
 *
 * @author Tom on 2021/1/20
 * @Retension只能用于修饰注解定义，用于指定被修饰的注释可以保留多长时间
 * @Retention里面成员变量的值有如下三个
 * @Retension(value=RetentionPolicy.RUNTIME) 注解保留到运行时
 * @Retension(value=RetentionPolicy.SOURCE) 注解保留到源代码
 * @Retension(value=RetentionPolicy.CLASS) 注解保留到类
 * @Override 用来指定方法覆载的
 * @Deprecated(since="9",forRemove=true) 标记该类对应的位置过时了
 * @SuppressWarning(value="unchecked") 告知编译器不需要检查
 * @SafeVarargs 忽略堆污染
 * @Target 只能修饰注解定义，用于指定被修饰的注解用于修饰哪些程序单元
 * @Target(ElementType.ANNOTATION_TYPE)
 * @Target(ElementType.CONSTRUCTOR)
 * @Target(ElementType.FIELD)
 * @Target(ElementType.LOCAL_VARIABLE)
 * @Target(ElementType.METHOD)
 * @Target(ElementType.PACKAGE)
 * @Target(ElementType.PARAMETER)
 * @Target(ElementType.TYPE) 指定该策略的注解可以修饰类，接口或者枚举定义
 * @Document 注解的类将被javadoc工具提取为文档
 * @Inherited 指定被它修饰的注解将具有继承性
 *
 */
@FunctionalInterface
public interface FunInterface {
    static void foo(){
        System.out.println("foo类方法");
    }
    default void bar(){
        System.out.println("bar默认方法");
    }
    void test();
}
