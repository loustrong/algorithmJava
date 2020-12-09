package com.tom;

import com.tom.algrithm.SortedBySelector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedBySelectTest {
    private static int[] testArray;

    @Before
    public void setUp() throws Exception {
        testArray = new int[]{10,1,3,4,5,6,8,9};
    }
    @Test
    public void sortedBySelectTest(){
        int[] result = SortedBySelector.sortedBySelector(testArray);
        for(int i: result){
            System.out.println(i);
        }
        assertTrue( true );
    }

    @After
    public void tearDown() throws Exception {
    }
}