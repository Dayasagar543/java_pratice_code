package com.practice1.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
    ReverseString rs = new ReverseString();
    @Test
    public void testReverseString() {
        assertEquals("avaj", rs.reverseString("java"));
        assertEquals("ayad", rs.reverseString("daya"));

    }
}
