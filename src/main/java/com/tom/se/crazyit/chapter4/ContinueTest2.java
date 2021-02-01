package com.tom.se.crazyit.chapter4;

/**
 * @descriptions: ContinueTest2
 * @author: Tom
 * @date: 2021/1/12 下午 05:36
 * @version: 1.0
 */
public class ContinueTest2 {
    public static void main(String[] args) {
        // 外層循環
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值為:" + i + "  j的值為:" + j);
                if(j == 1){
                    // 忽略outer標籤所指定的循環中本次循環所剩下的語句
                    continue outer;
                }

            }
        }
    }
}
