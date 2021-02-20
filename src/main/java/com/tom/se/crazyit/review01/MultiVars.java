package com.tom.se.crazyit.review01;

/**
 * @descriptions: MultiVars
 * @author: Tom
 * @date: 2021/2/20 上午 11:04
 * @version: 1.0
 */
public class MultiVars {
    public static void test(String a, String b, String... cs){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a + ",");
        stringBuilder.append(b + ",");
        for(String c: cs){
            stringBuilder.append(c + ",");
        }
        String result = stringBuilder.substring(0, stringBuilder.length() -1);
        System.out.println(result);
    }
    public static void main(String[] args) {
        test("a","b","c","d","e","f","g","h");
    }
}
