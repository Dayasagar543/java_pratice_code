/**
 * Calculator
 */
public class Calculator {
    int a;
    int b;

    public int add(int a, int b) {
        System.out.println("the sum of the two numbers from the calcualtor class is");
        return a + b;
    }

    // method overloading:
    // we can create multiple methods of same kind but the jvm will take the
    // method name or adopts its self to the number of paratmeters its given to it
    // and calls the method if the methods are of same name..
    // here is an example below

    public int add(int a, int b, int c) {
        System.out.println("this is the solution from 3 parameters additon");
        return a + b + c;
    }

    public int subtraction(int a, int b) {
        System.out.println("the difference of the two numbers from the calcualtor class is");
        return a - b;
    }

    public int mul(int a, int b) {
        System.out.println("the product of the two numbers from the calcualtor class is");
        return a * b;
    }

    public int div(int a, int b) {
        System.out.println("the quotient of the two numbers from the calcualtor class is \t");
        return a / b;
    }

    public int remainder(int a, int b) {
        System.out.println("the remainder of the two numbers from the calcualtor class is ");
        return a % b;
    }

}