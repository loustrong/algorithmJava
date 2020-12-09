package com.tom.se;

/**
 * @descriptions: randomSixNoDuplicate
 * @author: Tom
 * @date: 2020/12/2 下午 03:36
 * @version: 1.0
 */
public class RandomSixArray {
    public static void main( String[] args){
        int[] sixIntArray = new int[6];
        sixIntArray = generateSixRandomAndNoDuplicatedArray();
        for(int a: sixIntArray){
            System.out.println(a);
        }
    }
    private static int[] generateSixRandomAndNoDuplicatedArray(){
        int[] sixIntArray = new int[]{0,0,0,0,0,0};
        // while跟if的判斷條件一致
        while(sixIntArray[5] == 0){
            int temp = (int)(Math.random()*30 -1);
            int i = 0;
            for(; sixIntArray[i] != 0;i++){
                if(sixIntArray[i]==temp) {break;}
            }
            sixIntArray[i] = temp;
        }
        return sixIntArray;
    }
}
