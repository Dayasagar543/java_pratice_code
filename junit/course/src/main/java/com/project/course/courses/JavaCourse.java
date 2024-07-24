package com.project.course.courses;

public class JavaCourse implements Course{

    @Override
    public boolean coursePurchased() {
        System.out.println("purchased javacourse");
       return true;
    }
    
}
