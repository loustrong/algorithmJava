package com.tom;

public class SortedBySelector {
    public static int[] sortedBySelector(int[] input){
        // 對於數據的長度要有敏感性
        for(int i = 0; i <= input.length - 2; i++){
           for(int j = i + 1; j <= input.length - 1; j++){
               if(input[i] < input[j]){
                   int temp = input[j];
                   input[j] = input[i];
                   input[i] = temp;
               }
           }
        }
        return input;
    }
}
