package com.tom.se.crazyit.chapter06.chapter610;

/**
 * @descriptions: GcTest
 * @author: Tom
 * @date: 2021/1/18 下午 06:52
 * @version: 1.0
 */
public class GcTest {
    @Override
    public void finalize(){
        System.out.println("系統正在清理GcTest對象的資源");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 4; i++ ){
            new GcTest();
            // System.gc();
            Runtime.getRuntime().gc();
        }
    }
}
