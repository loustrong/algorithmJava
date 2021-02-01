package com.tom.se.io.file;

import java.io.File;

/**
 * @descriptions: File Class Test
 * @author: Tom
 * @date: 2020/12/30 下午 11:39
 * @version: 1.0
 */
public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("scor.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println(file.exists());
    }
}
