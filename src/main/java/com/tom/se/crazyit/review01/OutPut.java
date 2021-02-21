package com.tom.se.crazyit.review01;

/**
 * OutPut
 *
 * @author Tom on 2021/2/21
 */
public interface OutPut {
    int MAX_CACHE_LINE = 50;
    void out();
    void getData(String msg);
    default void print(String... msgs){
        for (String msg: msgs
             ) {
            System.out.println(msg);
        }
    }
    default void test(){
        System.out.println("默认的test()方法.");
    }
    static String staticTest(){
        return "接口里面的类方法";
    }
    // Java9可以定义私有方法
//    private void foo(){
//        System.out.println("定义私有方法。");
//    }

}
