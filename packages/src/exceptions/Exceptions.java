package src.exceptions;

public class Exceptions {
    {
        // statement can be normal and critical based on what kind of statement we try
        // to handle the sitatuion using the exceptions

        try {
            int i = 8;
            int result = i / 0;
            System.out.println(result);
        } catch (Exception e) {// exception is in gereal we can use it but we can also be very specific in the
                               // matters for over all we can use but if we want to use specifically then we
                               // use the respective excpetions
            System.out.println("zero division error!!!");
        }
        // catch (ArithmeticException ar) {
        // System.out.println(ar);
        // }
        // catch( IndexOutOfBoundsException in){
        // System.out.println(in);
        // }
    }

}
// always use parent class exceptions at the end that default exception handler
// class.