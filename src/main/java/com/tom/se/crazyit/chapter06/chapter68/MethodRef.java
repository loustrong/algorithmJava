package com.tom.se.crazyit.chapter06.chapter68;

/**
 * @descriptions: MethodRef
 * @author: Tom
 * @date: 2021/1/17 下午 11:43
 * @version: 1.0
 */
public class MethodRef {
    public static void main(String[] args) {
        Converter converter1 = from -> Integer.valueOf(from);
        Integer val = converter1.convert("99");
        System.out.println(val);
        Converter convert2 = from -> "fkit.org".indexOf(from);
        Integer value = convert2.convert("it");
        System.out.println(value);
        MyTest myTest = (a, b, c) -> a.substring(b,c);
        String str = myTest.test("Java, I love you", 2, 9);
        System.out.println(str);
    }
}

@FunctionalInterface
interface Converter{
    Integer convert(String from);
}
@FunctionalInterface
interface MyTest{
    String test(String a, int b, int c);
}