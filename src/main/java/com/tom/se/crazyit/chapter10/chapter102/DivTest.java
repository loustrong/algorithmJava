package com.tom.se.crazyit.chapter10.chapter102;

/**
 * @descriptions: DivTest
 * @author: Tom
 * @date: 2021/1/20 上午 12:00
 * @version: 1.0
 */
public class DivTest {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您輸入的兩個數相除的結果是:" + c);
        } catch(IndexOutOfBoundsException ie){
            System.out.println("輸入參數個數不夠");
        }catch(NumberFormatException ne){
            System.out.println("數字格式異常,程序只能接收整數參數");
        }catch(ArithmeticException ae){
            System.out.println("算數異常");
        }catch(Exception e){
            System.out.println("未知異常");
        }
    }
}
