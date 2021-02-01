package com.tom.se.io;

//import com.sun.org.apache.xpath.internal.operations.String;

import javax.print.DocFlavor;

/**
 * @descriptions: string demo
 * @author: Tom
 * @date: 2020/12/30 上午 12:11
 * @version: 1.0
 */
public class StringDemo {
    public static void main(String[] args) {
        String message = new String("Welcome to Java.");
        char[] charsArray = {'G','o','o','d',',', 'd','a','y','!'};
        String message1 = new String(charsArray);
        "Java".toUpperCase().matches("JAVA");
        "jAVA".toUpperCase().equals("JAVA");
        String.valueOf(123);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Welcome");
        stringBuffer.append(" ");
        stringBuffer.append("to");
        stringBuffer.append(' ');
        stringBuffer.append("Java");


    }
}
