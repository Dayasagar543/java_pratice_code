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
    void testPerimeterSquare() {
        assertEquals(16, sp.perimeterSquare(4),"Perimeter of the square calculation is wrong");
    }
    @Test
    void testAreaRectangle() {
        assertEquals(8, sp.areaRectangle(4, 2),"the area of rectangle is not properly calcualted");
    }

    @Test
    void testPerimeterRectangle() {
        assertEquals(12, sp.perimeterRectangle(4, 2),"Perimeter of the Rectangle calculation is wrong");
    }
}
