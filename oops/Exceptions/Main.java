package Exceptions;

import Exceptions.thro_w.Throw;
import Exceptions.throw_s.Calc;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 18;
        try {
            int result = j / i;
            System.out.println(result);
        } catch (Exception e) {// this is an object which is being thrown at us for handling
            System.out.println("something went wrong");
        }

        System.out.println("The value of j is " + j);
        System.out.println("The value of i is " + i);

        Error er = new Error();
        er.exceptions(18, 2);

        // example of thow key word
        Throw th = new Throw();
        th.trow(0, 2);

        // working of throws key word

        Calc cc = new Calc();

        try {
            //ducking exceptions
            cc.show();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();// this would print the stack trace of the functions being called in the
                                // processs
        }

    }
}
