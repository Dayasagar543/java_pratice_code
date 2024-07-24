package com.project.course.courses;

public class Junitcourse implements Course {

    @Override
    public boolean coursePurchased() {

        System.out.println("purchased Junit course");
        return true;

    }

}
