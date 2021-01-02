package com.tom.algrithm;

import java.util.Scanner;

/**
 * @descriptions: Greatest Common Divisor
 * @author: Tom
 * @date: 2020/12/12 上午 11:38
 * @version: 1.0
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the first number.");
        int first = input.nextInt();
        System.out.println("Please input the second number.");
        int second = input.nextInt();
        int greatestDivisor = getGreatestCommonDivisor(first,second);
        System.out.println("The greatest divisor of " + first + " and " + second + " is " +greatestDivisor);
    }
    public static int getGreatestCommonDivisor(int first,int second){
        int modValue = first % second;
        if(modValue == 0){ return second;}
        else{
            return getGreatestCommonDivisor(second,modValue);
        }

    }
}
