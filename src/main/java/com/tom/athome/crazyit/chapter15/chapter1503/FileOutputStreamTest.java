package com.tom.athome.crazyit.chapter15.chapter1503;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStreamTest
 *
 * @author Tom on 2021/1/20
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
                FileOutputStream fos = new FileOutputStream("newFile.txt")) {
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            while((hasRead = fis.read(bbuf)) > 0){
                fos.write(bbuf, 0, hasRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
