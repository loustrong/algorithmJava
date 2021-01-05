package com.tom.athome;

import java.util.Scanner;

/**
 * Enum Test
 *
 * @author Tom on 2021/1/1
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size:" + size);
        System.out.println("abbression=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the _.");
        }
    }
}
