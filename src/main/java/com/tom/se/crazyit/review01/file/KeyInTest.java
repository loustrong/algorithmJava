package com.tom.se.crazyit.review01.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @descriptions: KeyInTest
 * @author: Tom
 * @date: 2021/2/27 下午 01:27
 * @version: 1.0
 */
public class KeyInTest {
    public static void main(String[] args) throws IOException {
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader)){
            String line = null;
            while((line=br.readLine())!=null){
                if(line.equals("exit")){
                    System.exit(1);
                }
                System.out.println("輸入的內容為:"+ line);
            }
        }
    }
}
