package com.practice3;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.practice3.shapes.Shapes;

public class TestBeforeAfter {

    @BeforeAll
    static void before_all() {// this method should be static so that it can be called once when ever you use
                              // @beforeall
        System.out.println("Before all");
    }

    @AfterAll
    static void after_all() {
        System.out.println("After all");
        // this method should be static so that it can be called once when ever you use
        // @afterall

    }

    Shapes shape;

    @BeforeEach
    void init() {
        shape = new Shapes();
        System.out.println("Before test");

    }

    @Test
    void testArea_square() {
        assertEquals(16, shape.areaSquare(4));
        System.out.println("Actual test is running");
    }

    @Test
    void testArea_cicle() {
        assertEquals(shape.areacicle(5), shape.areacicle(5));
        System.out.println("Actual test is running");
    }

    @AfterEach
    void destory() {
        System.out.println("after each");
    }
}
