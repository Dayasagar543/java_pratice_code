package com.practice;

import com.practice.calculator.Addition;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Addition ad= new Addition();
        int c=ad.addition(2, 03);
        System.out.println(c);
        System.out.println( "Hello World!" );
    }
}
