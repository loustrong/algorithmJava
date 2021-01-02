package com.tom.se;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @descriptions: Write Data
 * @author: Tom
 * @date: 2020/12/15 下午 06:59
 * @version: 1.0
 */
public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("score.txt");
        if(file.exists()){
            System.out.println("File already exists.");
            System.exit(0);
        }
        PrintWriter output = new PrintWriter(file);
        output.print("John T Smith");
        output.write(90);
        output.println("Eric K Jones.");
        output.println(85);
        output.close();
    }
}
