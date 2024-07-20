package com.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.practice.calculator.Addition;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void addtiontest() {
        Addition ad = new Addition();
        int c = ad.addition(5, 3);
        int expected = 8;
        assertEquals(expected, c);
    }
}
