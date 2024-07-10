package Exceptions.throw_s;

public class Calc {
    public void show() throws ClassNotFoundException {
        Class.forName("Car");
    }

}
