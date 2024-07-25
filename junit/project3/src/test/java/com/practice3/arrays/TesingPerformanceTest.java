package com.practice3.arrays;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class TesingPerformanceTest {

    @Test
    void testSorting_arr() {
        TesingPerformance tp = new TesingPerformance();
        int[] unSorted = { 1, 2, 35, 3, 2 };

        assertTimeout(Duration.ofMillis(10), () -> tp.sorting_arr(unSorted));// what ever the implementation method of
                                                                             // the if its not in the specified time of
                                                                             // the duration in assert timeout then the
                                                                             // test case would fail // try giving the
                                                                             // time in very less like 5 or 1 then i
                                                                             // would throw an error
    }
}
