package com.tom.se.io.file;

import java.io.File;

/**
 * @descriptions: Replace Text
 * @author: Tom
 * @date: 2020/12/31 上午 12:03
 * @version: 1.0
 */
public class ReplaceText {
    public static void main(String[] args) {
        // Check command-line parameter usage
        if(args.length != 4){
            System.out.println("Usage: java replacement sourceFile targetFile oldStr newStr");
            System.exit(0);
        }
        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.exit(0);
        }
    }
}
