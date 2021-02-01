package com.tom.se.crazyit.chapter03;

import java.net.SocketTimeoutException;

/**
 * @descriptions: RandomStr
 * @author: Tom
 * @date: 2021/1/12 下午 04:41
 * @version: 1.0
 */
public class RandomStr {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 6; i++) {
            int intVal = (int)(Math.random() * 26 + 97);
            result = result + (char)intVal;
        }
        System.out.println("randomResult:" + result);
    }
}

// 常量池(constant pool)指的是在編譯期被確定,並被保存在已編譯的.class文件中
// 的一些數據,它包含關於類,方法,接口中的常量,也包括字符串直接量
