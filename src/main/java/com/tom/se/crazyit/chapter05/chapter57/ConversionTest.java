package com.tom.se.crazyit.chapter05.chapter57;

/**
 * @descriptions: ConversionTest
 * @author: Tom
 * @date: 2021/1/15 下午 12:00
 * @version: 1.0
 */
public class ConversionTest {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int in = 5;
        Object obj = "Hello";
        if(obj instanceof String){
            String objStr = (String) obj;
        }

        Object objPri = Integer.valueOf(5);
        String str = (String) objPri;
//        String str = (String) objPri;
        // 為了防止強制轉換時出現異常
    }
}
