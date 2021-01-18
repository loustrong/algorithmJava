package com.tom.se.crazyit.chapter05.chapter52;

/**
 * @descriptions: PrimitiveTransferTest
 * @author: Tom
 * @date: 2021/1/13 下午 09:16
 * @version: 1.0
 */

  // Java里方法的參數傳遞只有一種: 值傳遞
  //  所謂值傳遞,就是將實際參數的副本(複製品)傳入方法內
  // 而參數本身不會受任何影響

public class PrimitiveTransferTest {
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("Swap方法里,a的值是 "+ a +"; b的值是:"+b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a,b);
        System.out.println("交換結束,a的值是:" + a + "; b的值是:" + b);
    }
}
