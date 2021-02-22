package com.tom.se.crazyit.review01.enumuberation;

/**
 * @descriptions: SeasonEnumTest
 * @author: Tom
 * @date: 2021/2/22 上午 11:40
 * @version: 1.0
 */
public class SeasonEnumTest {
    public static void main(String[] args) {
        SeasonEnum se = SeasonEnum.valueOf(SeasonEnum.class, "FALL");
        se = SeasonEnum.SPRING;
        System.out.println("se:" + se);
        switch (se){
            case SPRING:
                System.out.println("春天: 春暖花開!");
                break;
            case SUMMER:
                System.out.println("夏天: 夏日炎炎!");
                break;
            case FALL:
                System.out.println("秋天: 秋高氣爽!");
                break;
            case WINTER:
                System.out.println("冬天: 冬雪皚皚!");
                break;
            default:
                break;
        }
    }
}
