package com.tom.athome.crazyit.chapter14.chapter1403;

import java.lang.reflect.Method;

import static java.lang.Class.forName;

/**
 * ProcessorTest
 *
 * @author Tom on 2021/1/20
 */
public class ProcessorTest {
    public static void process(String clazz) throws ClassNotFoundException {
        int passed = 0;
        int failed = 0;
        for(Method m : forName(clazz).getMethods()){
            if(m.isAnnotationPresent(Testable.class)){
                try{
                    m.invoke(null);
                    passed++;
                }catch(Exception  e){
                    System.out.println("方法" + m + "运行失败，异常:" + e.getCause());
                    failed++;
                }
            }
        }
        System.out.println("共运行了:" + (passed + failed)
        + "个方法，其中:\n" + "失败了:" + failed + "个,\n"
                + "成功了:" + passed + "个!"
                );
    }
}
