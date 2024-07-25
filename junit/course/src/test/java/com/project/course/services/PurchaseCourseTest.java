package com.project.course.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.project.course.courses.Junitcourse;

public class PurchaseCourseTest {
    PurchaseCourse pc = new PurchaseCourse();

    @Test
    void testProceed_with_course_T() {

        assertTrue(pc.proceed_with_course(new Junitcourse()));
    }

    @Test
    void testProceed_with_course_F() {

        assertFalse(!pc.proceed_with_course(new Junitcourse()),
                () -> "we can give a message here like this using the supplier ");
    }
}
