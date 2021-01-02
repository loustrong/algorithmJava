package com.tom.se;

/**
 * @descriptions: FutureTuition
 * @author: Tom
 * @date: 2020/12/12 下午 01:19
 * @version: 1.0
 */
public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 1000;
        int year = 1;
        while(tuition < 2000){
            tuition = tuition * 1.07;
            year = year + 1;
        }
        System.out.println("In " + year + " years, the tution will be doubled.");
    }
}
