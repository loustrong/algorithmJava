package com.tom.se.crazyit.review01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @descriptions: Regressoin
 * @author: Tom
 * @date: 2021/2/22 下午 02:05
 * @version: 1.0
 */
public class regression {
    public static void main(String[] args) {
        // 使用字符串模擬從網絡上得到的網頁源碼
        String str = "我想求購一本<<瘋狂Java講義>>,盡快聯繫我13500006666" +
                "交朋友,電話號碼是13611125565" +
                "出售二手電腦,聯繫方式15899903312";
        // 創建一個Pattern對象,並用它建立一個Matcher對象
        // 該正則表達式只抓取13X和15X段的手機號
        // 實際要抓取哪些電話號碼,只要修改正則表達式即可
        Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }

        String regStr = "Java is very easy!";
        System.out.println("目標字符串是:" + regStr);
        Matcher m1 = Pattern.compile("\\w+").matcher(regStr);
        while(m1.find()){
            System.out.println(m1.group() + "字串的起始位置:" +
                    m1.start() + ", 其結束位置:" + m1.end());
        }


    }
}
