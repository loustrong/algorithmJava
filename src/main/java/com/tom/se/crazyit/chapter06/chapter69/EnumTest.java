package com.tom.se.crazyit.chapter06.chapter69;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

/**
 * @descriptions: EnumTest
 * @author: Tom
 * @date: 2021/1/17 下午 11:57
 * @version: 1.0
 */
public class EnumTest {
    public static void main(String[] args) {
        for(SeasonEnum s : SeasonEnum.values()){
            System.out.println(s);
        }
        new EnumTest().judge(SeasonEnum.SPRING);

    }
    public void judge(SeasonEnum s){
        switch(s){
            case SPRING:
                System.out.println("春暖花開,正好踏青!");
                break;
            case SUMMER:
                System.out.println("夏日炎炎,適合游泳");
                break;
            case FALL:
                System.out.println("秋高氣爽,進補及時");
                break;
            case WINTER:
                System.out.println("冬日雪飄,圍爐賞雪");
                break;
            default: break;
        }
    }
}
enum SeasonEnum{
    SPRING,SUMMER,FALL, WINTER
}
