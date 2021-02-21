package com.tom.se.crazyit.chapter07.chapter75;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @descriptions: FindGroup
 * @author: Tom
 * @date: 2021/1/19 上午 09:46
 * @version: 1.0
 */
public class FindGroup {
    public static void main(String[] args) {
        String str = "我想求購一本<<瘋狂java講義>>,盡快聯繫我,13500006666" +
                "交朋友,電話是13611125565" +
                "出售二手電腦,聯繫方式是15899903312";
        Pattern p = Pattern.compile("(13\\d)|(15\\d)\\d{8}");
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }


    }
}
