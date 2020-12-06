package com.tom.thirtyDays.day1;

/**
 * NineNineTable
 *
 * @author Tom on 2020/12/6
 */
public class NineNineTable {
    public static void main(String[] args) {
        System.out.println("Nine-Nine-Table.");
        for(int i =1; i <=9; i++){
            for(int j = i; j <=9; j++){
                System.out.print(i +"*" + j + "=" + i*j + "; ");
            }
            System.out.println();
        }

    }
}
