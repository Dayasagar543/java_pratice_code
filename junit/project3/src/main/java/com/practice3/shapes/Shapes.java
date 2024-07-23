package com.practice3.shapes;

public class Shapes {

    public int areaSquare(int side){
        return side*side;
    }
    public int perimeterSquare(int side){
        return 4*side;
    }
    public int areaRectangle(int length,int breadth){
        return length*breadth;
    }
    public int perimeterRectangle(int length,int breadth){
        return 2*(length+breadth);
    }


}
