package com.project.course.services;

import com.project.course.courses.Course;

public class PurchaseCourse {
    
    @SuppressWarnings("unused")
    private Course course;

    public boolean proceed_with_course(Course course) {
        return course.coursePurchased();
    }
}
