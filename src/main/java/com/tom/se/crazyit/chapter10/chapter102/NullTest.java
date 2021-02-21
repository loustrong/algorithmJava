package com.tom.se.crazyit.chapter10.chapter102;

import java.util.Date;

/**
 * @descriptions: NullTest
 * @author: Tom
 * @date: 2021/1/20 上午 12:06
 * @version: 1.0
 */
public class NullTest {
    public static void main(String[] args) {
        Date d = null;
        try{
            System.out.println(d.after(new Date()));
        }catch(NullPointerException ne){
            System.out.println("空指針異常");
        }catch(Exception ex){
            System.out.println("未知異常");
        }
    }
}
