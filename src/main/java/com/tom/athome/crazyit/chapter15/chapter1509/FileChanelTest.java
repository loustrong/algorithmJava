package com.tom.athome.crazyit.chapter15.chapter1509;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * FileChannelTest
 *
 * @author Tom on 2021/1/23
 */
public class FileChanelTest {
    public static void main(String[] args) {
        File f = new File("D:\\project\\algorithmJava\\src\\main\\java\\com\\tom\\athome\\crazyit\\chapter15\\chapter1509\\FileChanelTest.java");
        try(
                FileChannel inChannel = new FileInputStream(f).getChannel();
                FileChannel outChannel = new FileOutputStream("a.txt").getChannel();
                ){
            MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            Charset charset = Charset.forName("GBK");
            outChannel.write(buffer);
            buffer.clear();
            CharsetDecoder decoder = charset.newDecoder();
            // 使用解码器将ByteBuffer转换成CharBuffer
            CharBuffer charBuffer = decoder.decode(buffer);
            System.out.println(charBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
