package com.tom.se.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @descriptions: Write Datas
 * @author: Tom
 * @date: 2020/12/30 下午 11:51
 * @version: 1.0
 */
public class WriteDatas {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("helloScore.txt");
        if(file.exists()) {
            System.out.println("File already exists.");
            System.exit(0);
        }
        PrintWriter output = new PrintWriter(file);
        output.println("John T Smith");
        output.println(90);
        output.print("Eric K John");
        output.print(85);
        output.close();
    }
}
