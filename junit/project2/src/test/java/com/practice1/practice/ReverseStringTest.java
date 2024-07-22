package com.practice1.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testReverseString() {
        ReverseString rs = new ReverseString();
        assertEquals("avaj", rs.reverseString("java"));
        assertEquals("ayad", rs.reverseString("daya"));

    }
}
