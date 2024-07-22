package com.practice3.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapesTest {
    Shapes sp = new Shapes();

    @Test
    void testAreaSquare() {
        assertEquals(16, sp.areaSquare(4));
    }

    @Test
    void testPerimeter() {
        assertEquals(16, sp.perimeter(4),"Perimeter of the square calculation is wrong");
    }
}
