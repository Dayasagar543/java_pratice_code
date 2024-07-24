package com.project.course.courses;

public class SringBootcourse implements Course {

    @Override
    public boolean coursePurchased() {
        System.out.println("Purchased the springBootCourse");
        return true;
    }

}
