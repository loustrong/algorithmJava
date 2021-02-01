package com.tom.athome.crazyit.chapter18.chapter1803;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

/**
 * ParameterTest
 *
 * @author Tom on 2021/1/30
 */
public class ParameterTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Test> clazz = Test.class;
        Method replace  = clazz.getMethod("replace",
                String.class, List.class);
        // 获取指定方法的指定参数
        Parameter[] parameters = replace.getParameters();
        int index = 1;
        for (Parameter p: parameters){
            if(p.isNamePresent()){
                System.out.println("----第" + index + "个参数信息----");
                System.out.println("参数名:" + p.getName());
                System.out.println("形参类型:" + p.getType());
                System.out.println("泛型类型:" + p.getParameterizedType());
            }
        }
    }
}
class Test{
    public void replace(String str, List<String> list){}
}
