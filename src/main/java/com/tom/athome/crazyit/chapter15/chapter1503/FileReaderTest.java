package com.tom.athome.crazyit.chapter15.chapter1503;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReaderTest
 *
 * @author Tom on 2021/1/20
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("FileReaderTest.java")){
            char[] cbuf = new char[32];
            int hasRead = 0;
            while((hasRead = fr.read(cbuf)) > 0){
                System.out.println(new String(cbuf, 0 , hasRead));
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
