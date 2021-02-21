package com.tom.se.crazyit.chapter15.chapter1503;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @descriptions: StringNodeTest
 * @author: Tom
 * @date: 2021/1/21 下午 08:47
 * @version: 1.0
 */
public class StringNodeTest {
    public static void main(String[] args) {
        String src = "從明天起,做一個幸福的人\n"
         + "從明天起,做一個幸福的人\n";
        char[] buffer = new char[32];
        int hasRead = 0;
        try(StringReader sr = new StringReader(src)){
            while((hasRead = sr.read(buffer)) > 0){
                System.out.println(new String(buffer, 0 , hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(
                StringWriter sw = new StringWriter()
                ){
            sw.write("有一個美麗的新世界");
            System.out.println(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
