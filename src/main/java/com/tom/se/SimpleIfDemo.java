package com.tom.se;

import java.util.Scanner;

/**
 * @descriptions: simpleIfDemo
 * @author: Tom
 * @date: 2020/12/10 下午 07:15
 * @version: 1.0
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        if(number % 5 == 0){
            System.out.println("HiFive");
        }
        if(number % 2 == 0){
            System.out.println("HiEven");
        }
    }
}
