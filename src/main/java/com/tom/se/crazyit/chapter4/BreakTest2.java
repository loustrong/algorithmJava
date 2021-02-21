package com.tom.se.crazyit.chapter4;

/**
 * @descriptions: BreakTest2
 * @author: Tom
 * @date: 2021/1/12 下午 05:30
 * @version: 1.0
 */
public class BreakTest2 {
    public static void main(String[] args) {
        // break語句不僅可以結束其所在的循環,還可以直接結束
        // 其外層循環.此時需要在break後面緊跟一個標籤,這個標籤
        // 用於標示一個外層循環
        // continue只是忽略本次循環剩下的語句,接著開啟下次循環,
        // 並不會終止循環
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值為:" + i + ", j的值為:" + j);
                break outer;
            }

        }
    }
}
