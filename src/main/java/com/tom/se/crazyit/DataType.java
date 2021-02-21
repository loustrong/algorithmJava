package com.tom.se.crazyit;

/**
 * @descriptions: DataType
 * @author: Tom
 * @date: 2021/1/12 下午 04:09
 * @version: 1.0
 */
// byte 1個字節 8位
// short char 2個字節
// int float 4個字節
// long,double 8個字節
public class DataType {
    public static void main(String[] args) {
        byte a = 56;
        // 如果整數類型的數據超過int的定義,
        // 則需要數據值後面加上L
        long bigValue = 999999999999999L;
        // 可以把較小的值賦值成long,java依然會把這個數值當成int來處理
        // 因為int類型會自動把int類型轉換成long類型
        // java中整數值有4種表示方法: 十進制/二進制/十六進制
        // 二進制是以0b或者0B開頭, 八進制是以0開頭
        // 十六進制是以0x或者0X開頭
        double PI = 3.14_15926_536;
        // 表達式類型的自動提升
        // 當一個算數表達式中包含多個基本類型時,整個表達式的數據類型
        // 將發生自動提升.Java定義了如下的自動提升規則.
        // 所有byte/short/char類型提升到int類型
        // 整個算術表達式的數據類型自動提升到與表達式最高等級操作數
        // 同樣的類型.操作數的等級排列如下所示,位於箭頭右邊的類型的等級
        // 高於位於箭頭左邊類型的等級
        //          char  \
        //                int - long - float - double
        //  byte -> short /

        // 強制類型轉換
        // 當試圖把表數範圍大的類型轉換為表數範圍小的類型
        // 必須格外小心,因為非常容易引起信息的丟失
        int iValue = 233;
        byte bValue = (byte)iValue;
        System.out.println("bValue:" + bValue);
        double dValue = 3.98;
        int tol = (int)dValue;
        System.out.println("tol:" + tol);


    }
}
