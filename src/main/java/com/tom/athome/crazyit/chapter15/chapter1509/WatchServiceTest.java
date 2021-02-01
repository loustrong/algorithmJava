package com.tom.athome.crazyit.chapter15.chapter1509;

import java.io.IOException;
import java.nio.file.*;

/**
 * WatchServiceTest
 *
 * @author Tom on 2021/1/23
 */
public class WatchServiceTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Paths.get("C:/").register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY,
                StandardWatchEventKinds.ENTRY_DELETE
                );
        while(true){
            WatchKey key = watchService.take();
            for(WatchEvent<?> event: key.pollEvents()  ){
                System.out.println(event.context() + " 文件发生了 " + event.kind() + "事件");
            }
            boolean valid = key.reset();
            if(!valid){
                break;
            }
        }
    }
}
