package com.tom.se.crazyit.review01.file;

import java.io.*;

/**
 * @descriptions: FileInputStreamOutputStreamTest
 * @author: Tom
 * @date: 2021/2/27 上午 10:54
 * @version: 1.0
 */
public class FileInputStreamOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("\\GitHub\\algorithmjava\\src\\main\\java\\com\\tom\\se\\crazyit\\review01\\file\\FileInputStreamOutputStreamTest.java");
        FileOutputStream fos = new FileOutputStream("newReview001.txt");
        //創建文件的緩存存放區
        byte[] bbuf = new byte[1024];
        // 讀取的個數
        int hasRead = 0;
        while ((hasRead = fis.read(bbuf)) > 0){
            System.out.println(new String(bbuf, 0, hasRead));
            fos.write(bbuf,0,hasRead);

        }
        try(
                FileReader fr = new FileReader("\\GitHub\\algorithmjava\\src\\main\\java\\com\\tom\\se\\crazyit\\review01\\file\\FileInputStreamOutputStreamTest.java");
                FileWriter fw = new FileWriter("peom.txt")
                ){
            char[] cbuf = new char[32];
            int hasCharRead = 0;
            while((hasCharRead = fr.read(cbuf)) > 0){
                System.out.println(new String(cbuf, 0, hasCharRead));
            }
            fw.write("錦瑟無端五十弦");
        }
        fis.close();
    }
}
