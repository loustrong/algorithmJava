package com.tom.se.crazyit.review01.exception;

import java.util.Date;

/**
 * @descriptions: DivTest
 * @author: Tom
 * @date: 2021/2/23 下午 08:26
 * @version: 1.0
 */
public class DivTest {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您輸入的兩個數相除的結果是:" + c);
        }catch(IndexOutOfBoundsException ie){
            ie.getStackTrace();
        }catch(NumberFormatException ne){
            ne.printStackTrace();
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }catch (Exception e){
            System.out.println("未知異常");
            e.getMessage();
        }
        Date d = null;
        try{
            System.out.println(d.after(new Date()));
        }catch (NullPointerException e){
            System.out.println("空指針異常.");
        }
    }
}
