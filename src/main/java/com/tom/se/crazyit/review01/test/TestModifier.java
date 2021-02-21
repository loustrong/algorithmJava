package com.tom.se.crazyit.review01.test;

import com.tom.se.crazyit.review01.DefaultAccess;

/**
 * @descriptions: TestModifier
 * @author: Tom
 * @date: 2021/2/20 上午 11:35
 * @version: 1.0
 */
public class TestModifier extends DefaultAccess{
    public TestModifier(){
        super();
    }
    public static void main(String[] args) {
        DefaultAccess da = new DefaultAccess();
        da.c = 100;
    }
}
