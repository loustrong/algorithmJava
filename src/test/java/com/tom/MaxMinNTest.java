package com.tom;

import com.tom.algrithm.MaxMinN;
import org.junit.Test;

public class MaxMinNTest {

    @Test
    public void maxMinN() {
        int[] beTestedArray = new int[]{3,4,5,6,7,9,10,32,21,22};
        int m = 3;
        int[] result = MaxMinN.maxMinN(m,beTestedArray);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}