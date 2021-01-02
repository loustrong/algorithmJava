package com.tom.se;

/**
 * @descriptions: Test File Class
 * @author: Tom
 * @date: 2020/12/15 下午 06:55
 * @version: 1.0
 */
public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");
        file.exists();
        file.length();
        file.canRead();
        file.canWrite();
        file.isAbsolute();
    }
}
