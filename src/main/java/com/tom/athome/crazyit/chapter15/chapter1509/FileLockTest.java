package com.tom.athome.crazyit.chapter15.chapter1509;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * FileLockTest
 *
 * @author Tom on 2021/1/23
 */
public class FileLockTest {
    public static void main(String[] args) throws IOException {
        try(
                FileChannel channel = new FileOutputStream("a.tcxt").getChannel();
                ){
            FileLock lock = channel.tryLock();
            Thread.sleep(10000);
            lock.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
