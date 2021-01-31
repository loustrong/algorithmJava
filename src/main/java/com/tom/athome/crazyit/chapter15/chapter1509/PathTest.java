package com.tom.athome.crazyit.chapter15.chapter1509;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * PathTest
 *
 * @author Tom on 2021/1/23
 */
public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        System.out.println("path路径里面包含的路径数量:" + path.getNameCount());
        Path absolutePath = path.toAbsolutePath();
        System.out.println(absolutePath);
        System.out.println("absolute的根路径:" + absolutePath.getRoot());
        Path path2 = Paths.get("g:","publish","codes");
        System.out.println(path2);
    }
}
