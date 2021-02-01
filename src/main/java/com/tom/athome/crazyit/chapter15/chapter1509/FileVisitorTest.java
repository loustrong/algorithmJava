package com.tom.athome.crazyit.chapter15.chapter1509;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * FileVisitorTest
 *
 * @author Tom on 2021/1/23
 */
public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("g:","publish", "codes","15"), new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
                System.out.println("正在访问" + file + "文件");
                if(file.endsWith("FileVisitorTest.java")){
                    System.out.println("--已经找到目标文件--");
                    return FileVisitResult.TERMINATE;
                }
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
                System.out.println("正在访问" + dir + "路径");
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
