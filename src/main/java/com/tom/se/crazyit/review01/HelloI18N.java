package com.tom.se.crazyit.review01;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @descriptions: HelloI18N
 * @author: Tom
 * @date: 2021/2/22 下午 02:52
 * @version: 1.0
 */
public class HelloI18N {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
        System.out.println(bundle.getString("hello"));
    }
}
