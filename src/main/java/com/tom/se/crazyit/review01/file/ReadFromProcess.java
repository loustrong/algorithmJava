package com.tom.se.crazyit.review01.file;

import java.io.*;
import java.util.Scanner;

/**
 * @descriptions: ReadFromProcess
 * @author: Tom
 * @date: 2021/2/27 下午 02:26
 * @version: 1.0
 */
public class ReadFromProcess {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("javac");
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()))
        ) {
            String buff = null;
            while ((buff = br.readLine()) != null) {
                System.out.println(buff);
            }
        }
        Process p2 = Runtime.getRuntime().exec("java ReadStanderd");
        try(
                PrintStream ps = new PrintStream(p.getOutputStream())
                ){
            ps.println("普通字符串");
            ps.println(new ReadFromProcess());
        }
    }
}

class ReadStandard {
    public static void main(String[] args) throws FileNotFoundException {
        try (
                Scanner sc = new Scanner(System.in);
                PrintStream ps = new PrintStream(new FileOutputStream("out.txt"))
        ) {
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                ps.println("鍵盤輸入的內容是:" + sc.next());
            }
        }
    }
}