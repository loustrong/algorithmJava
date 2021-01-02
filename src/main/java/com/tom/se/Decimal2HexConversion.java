package com.tom.se;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.Scanner;

/**
 * @descriptions: Decimal to Hex Conversion
 * @author: Tom
 * @date: 2020/12/12 下午 01:34
 * @version: 1.0
 */
public class Decimal2HexConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number:");
        int num = input.nextInt();
        String hexValue = "";
        while(num != 0){
            int modeValue = num%16;
            char hexChar = convertHexToString(modeValue);
            hexValue = hexChar + hexValue;
            num = num / 16;
        }
        System.out.println(hexValue);
    }
    public static char convertHexToString(int x){
        char converter = 'A';
        if(x < 10){
            return (char)('0' + x);
        } else {
            return (char)(converter + (x-10));
        }

    }

}
