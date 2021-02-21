package com.tom.se.crazyit.chapter4;

/**
 * @descriptions: SwitchTest
 * @author: Tom
 * @date: 2021/1/12 下午 05:18
 * @version: 1.0
 */
public class SwitchTest {
    public static void main(String[] args) {
        char score = 'C';
        switch(score){
            case 'A':
                System.out.println("優秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("中");
                break;
            case 'D':
                System.out.println("及格");
                break;
            default:
                System.out.println("成績輸入錯誤!");

        }
    }
}
