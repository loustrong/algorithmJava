package com.tom;

public class SortedByBubble {
    public static int[] sortedByBubble(int[] input){
        for(int i = 0; i < input.length; i++){
            for(int j = i; j < input.length-1; j++){
                if(input[j] > input[j + 1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = input[j];
                }
            }
        }
        return input;
    }
}
