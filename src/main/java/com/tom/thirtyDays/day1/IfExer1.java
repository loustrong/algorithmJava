package com.tom.thirtyDays.day1;

import java.util.Scanner;

/**
 * test if
 *
 * @author Tom on 2020/12/6
 */
public class IfExer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高:(cm)");
        int height = scanner.nextInt();
        System.out.println("请输入你的财富: （千万）");
        double wealth = scanner.nextDouble();
        System.out.println("请输入你是帅还是不帅?（true/false）");
        boolean isHandsome = scanner.nextBoolean();
        if(height >=180 && wealth > 1 && isHandsome){
            System.out.println("我一定要嫁给他.");
        } else{
            System.out.println("不嫁！");
        }

    }
}
