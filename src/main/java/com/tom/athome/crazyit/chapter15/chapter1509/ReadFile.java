package com.tom.athome.crazyit.chapter15.chapter1509;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * ReadFile
 *
 * @author Tom on 2021/1/23
 */
public class ReadFile {
    public static void main(String[] args) {
        try(
                FileInputStream fis = new FileInputStream("ReadFile.java");
                FileChannel fcin =  fis.getChannel()
                ){
            ByteBuffer bbuff = ByteBuffer.allocate(256);
            while(fcin.read(bbuff)!=-1){
                bbuff.flip();
                Charset charset = Charset.forName("GBK");
                CharsetDecoder decoder = charset.newDecoder();
                CharBuffer cbuff = decoder.decode(bbuff);
                System.out.println(cbuff);
                bbuff.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
