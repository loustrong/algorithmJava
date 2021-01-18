package com.tom.se.crazyit.chapter05.chapter52;

/**
 * @descriptions: ReferenceTransferTest
 * @author: Tom
 * @date: 2021/1/13 下午 09:43
 * @version: 1.0
 */
public class ReferenceTransferTest {
    public static void swap(DataWrap dw){
        int tmp = dw.a;
        dw.a= dw.b;
        dw.b = tmp;
        System.out.println("dw.a 的值為:" + dw.a + ", dw.b的值為:" + dw.b);
        dw = null;
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交換結束后,a的值為:" + dw.a + "; b的值為:" + dw.b);
        dw = null;
    }
}

class DataWrap{
    int a;
    int b;
}