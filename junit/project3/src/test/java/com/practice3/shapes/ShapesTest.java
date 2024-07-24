package com.practice3.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ShapesTest {
    Shapes sp = new Shapes();

    // tesing using the assert equals for square and rectangle
    @Test
    void testAreaSquare() {
        assertEquals(16, sp.areaSquare(4));
    }

    @Test
    void testPerimeterSquare() {
        assertEquals(16, sp.perimeterSquare(4), "Perimeter of the square calculation is wrong");
    }

    @Test
    void testAreaRectangle() {
        assertEquals(8, sp.areaRectangle(4, 2), "the area of rectangle is not properly calcualted");
    }

    @Test
    void testPerimeterRectangle() {
        assertEquals(12, sp.perimeterRectangle(4, 2), "Perimeter of the Rectangle calculation is wrong");// using the
                                                                                                         // strings is
                                                                                                         // good but
                                                                                                         // this value
                                                                                                         // is
                                                                                                         // evalutated
                                                                                                         // even before
                                                                                                         // the values
                                                                                                         // are
                                                                                                         // evaluated
    }

    @Test
    void testPerimeterRectangle_Supplier() {
        assertEquals(12, sp.perimeterRectangle(4, 2),
                () -> "you the actual values are not compensting the expected values");// using the lamda will optimise
        // a little as the lamda is not
        // evaluated by the method its
        // only called or evaluated when
        // there is an error or assertion
        // fails
    }

    // testing using the assert not equals method for circle
    @Test
    void testAreacircle() {
        assertNotEquals(45, sp.areacicle(0));
    }

    @Test
    void testcircumferenceCircle_Supplier() {
        assertNotEquals(23, sp.circumferenceCicle(0), () -> "Perimeter of the circle calculation is wrong");// also
                                                                                                            // called
                                                                                                            // lazy
                                                                                                            // evaluation
    }

    @SuppressWarnings("unused")
    @Test
    void testTrue() {
        assertTrue(5 > 4 ? true : false);

    }

    @SuppressWarnings("unused")
    @Test
    void testFalse() {
        assertFalse(4 > 4 ? true : false);

    }
}
