package com.tom.algrithm;

public class MaxMinN {
    public static int[] maxMinN(int m, int[] input){

        int[] maxM = new int[m];
        for(int i = 0; i < m; i++){
            maxM[i] = input[i];
        }
        // 如下為使用冒泡排序對前M個數據進行排序
        for(int i = 0; i < m - 1; i++){
            for(int j = i + 1; j < m; j++ ){
                if(maxM[j-1] > maxM[j]){
                   int tmp = maxM[j-1];
                    maxM[j-1] = maxM[j];
                    maxM[j] = tmp;
                }
            }
        }
        for(int k = m; k < input.length; k++){
            maxM = getMaxM(maxM, input[k]);
        }

        return maxM;
    }
    public static int[] getMaxM(int[] maxME, int n){
        for(int i = maxME.length - 1; i >= 0; i--){
            if(n > maxME[i]){
                for(int j=i; j > 0; j--){
                    maxME[j - 1] = maxME[j];
                }
                maxME[i] = n;
                return maxME;
            }
        }
        return maxME;
    }
}
