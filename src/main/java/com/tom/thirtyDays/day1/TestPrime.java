package com.tom.thirtyDays.day1;

import java.util.ArrayList;

/**
 * TestPrime
 *
 * @author Tom on 2020/12/6
 */
public class TestPrime {
    public static void main(String[] args) {
        int intLength = 10000;
        ArrayList<Integer> primeList = getPrimeArray(intLength);
//        for(int i = 0; i < primeArray.length; i++){
//            System.out.println(primeArray[i]);
//        }
    }

    private static ArrayList<Integer> getPrimeArray(int intLength) {
//        int[] primeArray = new int[intLength];
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        int count = 0;
        for(int i = 2; i <= intLength; i++){
            boolean isIntDivide = false;
            for(int j = 0, k = 2; j < primeList.size();j++){
                if( primeList.size() != 0){
                    k = primeList.get(j);
                }
                if(i % k == 0){
                    isIntDivide = true;
                    break;
                }

            }
            if(!isIntDivide){
                primeList.add(i);
                System.out.println("count:" + i);
                count++;
            }
        }
        return primeList;
    }
}
