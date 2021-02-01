package com.tom.se.crazyit.chapter4;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

/**
 * @descriptions: ArraysTest
 * @author: Tom
 * @date: 2021/1/12 下午 07:32
 * @version: 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {
        // 定義一個a數組
        int[] a = new int[]{3,4,5,6};
        int[] a2 = new int[]{3,4,5,6};
        // 如果a數組和a2的長度相等,每個元素依次相等,將輸出true
        System.out.println("a數組和a2數組是否相等:" + Arrays.equals(a,a2));
        int[] b = Arrays.copyOf(a,6);
        System.out.println("b數組的元素為:" + Arrays.toString(b));
        Arrays.fill(b, 2, 4, 1);
        // 輸出b數組元
        System.out.println("b數組的元素為:" + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("b的數組元素為:" + Arrays.toString(b));
        // void parallelPrefix(xxx[] array, XxxBinaryOperator op):
        // 該方法使用op參數指定的計算公式得到的結果作為新的元素. op計算公式包含
        // left和right兩個形參,其中left代表數組中前一個索引處的元素,right代表數組
        // 中當前索引處的元素,當計算第一個數組元素時,left的值默認為1
        // void parallelPrefix(xxx[] array, int fromIndex, int toIndex, XxxBinaryOperator op):
        // 該方法與上一個方法類似,區別在於該方法僅重新計算fromIndex到toIndex索引云阿蘇的值
        // void setAll(xxx[] array,IntToXxxFunction generator): 該方法使用指定的生成器(generator)
        // 為所有數組元素設置值,該生成器控制數組元素的生成算法
        // void parallelSetAll(xxx[] array, IntToXxxFunction generator): 該方法功能與前一方法相同,只是
        // 方法增加了並行能力,可以利用多CPU並行來提高性能
        // void parallelSort(xxx[] a) 該方法的功能與以前就有的sort()方法類似,只是該方法增加了並行能力
        // void parallelSort(xxx[] a, int fromIndex, int toIndex):該方法與前面方法類似,區別在於該方法
        // 僅僅是對fromIndex到toIndex索引元素進行排序
        // Spliterator.OfXxx spliterator(xxx[] array): 將數組的所有元素轉換成對應的Spliterator對象
        // Spliterator.OfXxxx spliterator(xxx[] array, int startInclusive, int endExclusive):
        // 該方法與前一個方法相似,區別在於該方法僅轉換startInclusive到endInclusive索引的元素
        // XxxStream stream(xxx[] array): 該方法將數組轉換成Stream,Stream是Java8新增的流式編程的API
        // XxxStream stream(xxx[] array, int startInclusive, int endInclusive): 該方法與上一個方法類似
        // 區別是該方法僅將fromIndex到toIndex索引的元素轉換為stream
        // 上面的所有方法,所有以parallel開頭的表示的方法都可以利用CPU的並行處理來提高性能.


        int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator(){

            @Override
            public int applyAsInt(int left, int right) {
                return left*right;
            }
        });
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * 5;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
