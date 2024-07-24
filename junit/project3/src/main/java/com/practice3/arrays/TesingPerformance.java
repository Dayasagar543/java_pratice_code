package com.practice3.arrays;

import java.util.Arrays;

public class TesingPerformance {
    public int[] sorting_arr(int[] arr) {
        for (int i = 0; i <10000; i++) {
            Arrays.sort(arr);
        }
        
        return arr;
    }

}
 