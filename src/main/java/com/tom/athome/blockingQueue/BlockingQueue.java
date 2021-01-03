package com.tom.athome.blockingQueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * Blocking Queue
 *
 * @author Tom on 2021/1/3
 */
public class BlockingQueue {
    private static final int FILE_QUEUE_SIZE = 10;
    private static final int SEARCH_THREADS = 100;
    private static final File DUMMY = new File("");
    private static java.util.concurrent.BlockingQueue<File> queue = new ArrayBlockingQueue<File>(FILE_QUEUE_SIZE);
    public static void enumberate(File directory) throws InterruptedException {
        File[] files = directory.listFiles();
        for(File file: files){
            if(file.isDirectory())enumberate(file);
            else queue.put(file);
        }
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter base directory (e.g. /opt/jdk1.8.0/src):");
            String directory = in.nextLine();
            System.out.print("Enter keyword (e.g. volatile):");
            String keyword = in.nextLine();

            Runnable enumerator = () ->{
                try{
                    enumberate(new File(directory));
                    // 小技巧:在工作结束后终止这个应用程序
                    // 为了发出完成信号,枚举线程放置一个虚拟对象到队列中
                    // 这就好像在行李输送带上放着写着"最后一个包"的虚拟包
                    // 当搜索到这个虚拟对象时,将其放回并终止
                    queue.put(DUMMY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(enumerator).start();
            for(int i = 1; i <= SEARCH_THREADS; i++){
                Runnable searcher = () ->{
                    try{
                        boolean done = false;
                        while(!done){
                            File file = queue.take();
                            if(file == DUMMY){
                                queue.put(file);
                                done = true;
                            }
                            else search(file, keyword);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                };
                new Thread(searcher).start();
            }

        }

    }
    public static void search(File file, String keyword) throws FileNotFoundException {
        try(Scanner in = new Scanner(file, "UTF-8")){
            int lineNumber = 0;
            while(in.hasNext()){
                lineNumber++;
                String line = in.nextLine();
                if(line.contains(keyword)){
                    System.out.printf("%s:%d:%s%n", file.getPath(),lineNumber, line);
                }
            }
        }
    }
}

// java.util.concurrent.BlockingQueue<E>
// void put(E element) 添加元素,必要时阻塞
// E take() 移除并返回头元素,必要时阻塞
// boolean offer(E element, long time, TimeUnit unit) 添加给定的元素,如果成功返回true,如果必要时阻塞,直至元素添加或者超时
// E poll() 移除并返回头元素,必要时阻塞,直至元素用完或者超时用完。失败时返回null
