package com.tom.se.crazyit.review01.file;

import java.io.*;
import java.util.RandomAccess;

/**
 * @descriptions: RandomAccessFileTest
 * @author: Tom
 * @date: 2021/2/27 下午 03:35
 * @version: 1.0
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        try(RandomAccessFile raf = new RandomAccessFile("a.txt","r")){
            // 獲取RandomAccessFile對象文件指針的位置,初始位置是0
            System.out.println("RandomAccessFile的文件指針的位置"+ raf.getFilePointer());
            raf.seek(2);
            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            while((hasRead = raf.read(bbuf))>0){
                System.out.println(new String(bbuf, 0, hasRead));
            }
        }
        try(RandomAccessFile raf = new RandomAccessFile("a.txt","rw")){
            raf.seek(raf.length());
            raf.write("追加的內容!\r\n".getBytes());
            insert("a.txt",5,"插入的內容:aaaaaaa.\r\n");
        }
    }
    public static void insert(String fileName, long pos, String insertContent) throws IOException {
        File tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();
        try(
                RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
                FileOutputStream tmpOut = new FileOutputStream(tmp);
                FileInputStream tmpIn = new FileInputStream(tmp)
                ){
            raf.seek(pos);
            // ---- 下面的文件將插入點后的內容讀入臨時文件中保存----
            byte[] bbuf = new byte[64];
            int hasRead = 0;
            while((hasRead = raf.read(bbuf)) > 0){
                tmpOut.write(bbuf,0,hasRead);
            }
            // ------ 下面的代碼用於插入內容
            // 把文件指針重新指向pos位置
            raf.seek(pos);
            raf.write(insertContent.getBytes());
            while((hasRead = tmpIn.read(bbuf)) > 0){
                raf.write(bbuf, 0, hasRead);
            }
        }
    }
}









