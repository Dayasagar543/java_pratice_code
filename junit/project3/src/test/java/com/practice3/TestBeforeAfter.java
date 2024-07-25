package com.practice3;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.practice3.shapes.Shapes;

// @TestInstance(TestInstance.Lifecycle.PER_METHOD) // this is the default behaviour
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // this would not create multiple instances for multiple methods
public class TestBeforeAfter {

    TestBeforeAfter() {
        System.out.println("test object is created");
    }

    @BeforeAll
    static void before_all() {// this method should be static so that it can be called once when ever you use
                              // @beforeall
                              // we can remove the static key workds once we write the line 16.
        System.out.println("Before all");
    }

    @AfterAll
    static void after_all() {// we can remove the static key workds once we write the line 16.
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
