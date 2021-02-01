package com.tom.se;

import java.util.Scanner;

/**
 * @descriptions: guessNumber
 * @author: Tom
 * @date: 2020/12/10 下午 07:31
 * @version: 1.0
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = -1;
        int n = (int) (Math.random() * 101);
        // while語句類似於if語句
        while(guess != n){
            guess = input.nextInt();
            if(n < guess){
                System.out.println("Your number you input is higher.");
            } else if(n > guess){
                System.out.println("Your number you input is lower.");
            } else {
                System.out.println("Your number you input is absolute right.");
            }
        }
    }
}
