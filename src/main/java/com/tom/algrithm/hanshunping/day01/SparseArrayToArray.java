package com.tom.algrithm.hanshunping.day01;

/**
 * @descriptions: SparseArrayToArray
 * @author: Tom
 * @date: 2021/2/1 上午 11:45
 * @version: 1.0
 */
public class SparseArrayToArray {
    public static void main(String[] args) {
        int[][] intArray = new int[][]{
                {0,0,0,0,0,1},
                {0,1,0,0,0,0},
                {0,1,3,4,6,0},
                {1,0,0,0,1,3}
        };
        int[][] sparseArray = convertSparseToArray(intArray);

        System.out.println("----------------------------------------------");
        for (int i = 0; i < sparseArray.length ; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                System.out.print(" " +sparseArray[i][j]);
            }
            System.out.println("\n");
        }
        intArray = convertSparseToNormalArray(sparseArray,10,10);
        for (int i = 0; i < intArray.length ; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(" " +intArray[i][j]);
            }
            System.out.println("\n");
        }
    }
    public static int[][] convertSparseToArray(int[][] intArray){
        int sparseLength = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if(intArray[i][j] != 0){
                    sparseLength ++;
                }
            }
        }
        int[][] sparseArray = new int[sparseLength][3];
        int k = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length ; j++) {
                if(intArray[i][j] != 0) {
                    sparseArray[k][0] = i;
                    sparseArray[k][1] = j;
                    sparseArray[k][2] = intArray[i][j];
                    k++;
                }
            }
        }
        return sparseArray;
    }

    public static int[][] convertSparseToNormalArray(int[][] sparseArray,int x, int y){
        int[][] intArray = new int[x+1][y+1];
        System.out.println("x:" + x + ", y:" + y);
        for (int i = 0; i < sparseArray.length; i++) {
            intArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        return intArray;
    }
}
