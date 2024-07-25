package com.practice3.arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
// import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Sorted_arrayTest {

    // private int[] data = { 2, 3, 5, 1, 3, 6 };

    // @SuppressWarnings("unused")
    @Test
    void testSorted_array() {
        // ar.sorted_array(data);
        // try {
        Sorted_array ar = new Sorted_array();
        // // int[] array = { 1, 4, 5, 6, 7 };
        // int[] array = null;
        // int[] sortedArray = ar.sorted_array(array);
        // System.out.println("the array is sorted");
        // fail();

        // } catch (NullPointerException e) {
        // System.out.println("exception generated");
        // }

        // int[] array = { 1, 4, 5, 6, 7 };
        int[] array = null;
        assertThrows(NullPointerException.class, () -> ar.sorted_array(array));
    }

}
