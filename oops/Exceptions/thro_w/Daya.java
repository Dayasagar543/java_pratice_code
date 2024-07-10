package Exceptions.thro_w;

public class Daya extends Exception {// you can also extend to runtimeexception instead of exception class.
    Daya(String message) {
        // System.out.println(message);
        // instead of the above line you can also pass the exception message to super
        // class i.e Exception class it will handle the messages just pass string to
        // super()

        super(message);
    }

}
