package com.tom.athome.crazyit.chapter15.chapter1509;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * RandomFileChannelTest
 *
 * @author Tom on 2021/1/23
 */
public class RandomFileChannelTest {
    public static void main(String[] args) {
        File f = new File("a.txt");
        try(
                RandomAccessFile raf = new RandomAccessFile(f, "rw");
                FileChannel randomChannel = raf.getChannel()
                ){
            // 将Channel中所有的数据映射成ByteBuffer
            ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY,0, f.length());
            randomChannel.position(f.length());
            randomChannel.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
