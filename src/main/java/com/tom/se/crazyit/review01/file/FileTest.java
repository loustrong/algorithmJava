package com.tom.se.crazyit.review01.file;

import java.io.File;
import java.io.IOException;

/**
 * @descriptions: FileTest
 * @author: Tom
 * @date: 2021/2/27 上午 09:43
 * @version: 1.0
 */
public class FileTest {
    public static void main(String[] args) throws IOException {

       File file = new File(".");
       String[] nameList = file.list((dir,name) -> name.endsWith(".java")|| new File(name).isDirectory());
        for (String name:nameList
             ) {
            System.out.println("filterName:" + name);
        }
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile().getParent());
        File tmpFile= File.createTempFile("aaa",".txt",file);
        // 指定當虛擬機退出時刪除文件
        tmpFile.deleteOnExit();
        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile對象是否存在:" + newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();
        // 使用list()方法列出當前路徑下所有文件和路徑
        String[] fileList = file.list();
        System.out.println("===當前路徑下所有文件和路徑如下:");
        for(String fileName: fileList){
            System.out.println(fileName);
        }
        File[] roots = File.listRoots();
        System.out.println("====系統所有根目錄路徑如下===");
        for(File root : roots){
            System.out.println(root);
        }

    }
}
