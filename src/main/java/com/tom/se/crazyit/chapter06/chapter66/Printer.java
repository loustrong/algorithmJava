package com.tom.se.crazyit.chapter06.chapter66;

import java.sql.SQLOutput;

/**
 * @descriptions: Printer
 * @author: Tom
 * @date: 2021/1/16 下午 10:00
 * @version: 1.0
 */
public class Printer implements Output, Product {
    private String[] printData = new String[MAX_CACHE_LINE];
    private int dataNum = 0;
    @Override
    public void out() {
        while(dataNum > 0){
            System.out.println("打印機打印:" + printData[0]);
            System.arraycopy(printData, 1, printData,0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if(dataNum >= MAX_CACHE_LINE){
            System.out.println("輸出隊列已滿,添加失敗");
        } else {
            printData[dataNum++] = msg;
        }
    }

    @Override
    public int getProduceTime() {
        return 45;
    }

    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("輕量級Java EE企業應用實戰");
        o.getData("瘋狂Java講義");
        o.out();
        o.getData("瘋狂Android講義");
        o.getData("瘋狂Ajax講義");
        o.print("孫悟空","豬八戒","白骨精");
        o.test();
        Product p = new Printer();
        System.out.println(p.getProduceTime());
        Object obj = p;
    }
}
interface Product{
    int getProduceTime();
}
