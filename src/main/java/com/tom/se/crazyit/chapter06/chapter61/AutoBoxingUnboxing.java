package com.tom.se.crazyit.chapter06.chapter61;

/**
 * @descriptions: AutoBoxingUnboxing
 * @author: Tom
 * @date: 2021/1/15 下午 04:31
 * @version: 1.0
 *
 * 基本數據類型  | 包裝類
 * byte  -- Byte
 * short -- Short
 * int   -- Integer
 * long  -- Long
 * char -- Character
 * float -- Float
 * double -- Double
 * boolean -- Boolean
 *
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer intObj = 5;
        Object boolObj = true;
        int it = intObj;
        if(boolObj instanceof Boolean){
            boolean b = (Boolean) boolObj;
            System.out.println(b);
        }
    }

}
