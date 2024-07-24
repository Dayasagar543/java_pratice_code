package com.practice3.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArrayTest {
    Array ar = new Array();

    @Test
    void testArrayTest() {
        int[] array_expected = { 1, 2, 3, 4,5 };
        assertArrayEquals(array_expected, ar.array1);
    }
}
