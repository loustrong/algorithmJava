package com.tom.se;

/**
 * @descriptions: One Dimension Array
 * @author: Tom
 * @date: 2020/12/15 下午 03:41
 * @version: 1.0
 */
public class OneDimensionArray {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5,6,7,8,9};
        for(int first: firstArray){
            System.out.println("first:" + first);
        }
        double[] secondArray = new double[]{1,4,5,6,7};
        printMax(34,1,3,2,56.5);
        printMax(new double[]{1,2,3,4,5});
        printMax(secondArray);
    }

    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
        }
        double result = numbers[0];
        for(int i = 1; i < numbers.length;i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is:" + result);
    }
}
