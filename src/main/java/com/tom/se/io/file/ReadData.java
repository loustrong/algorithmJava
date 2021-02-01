package com.tom.se.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @descriptions: Read Data
 * @author: Tom
 * @date: 2020/12/30 下午 11:57
 * @version: 1.0
 */
public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("score.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
            firstName + " " + mi + " " + lastName + " " + score
            );
        }
        input.close();
    }
}
