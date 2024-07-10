package Exceptions.thro_w;

public class Throw {
    public void trow(int dividend, int divisior) {
        try {
            int result = dividend / divisior;
            System.out.println(result);
            // suppose the condition in line 6 is always true it will not call the catch and
            // what if the condition that the result is zero if its zero we want to call the
            // catch to call catch we use the key word called throw below is the code

            if (result == 0) {
                // throw new ArithmeticException("message you want here ");//this is default and
                // we want to customise
                // our own exception then we use the code below like
                throw new Daya("the result should not be zero");
            }
        }
        // catch (Exception e) {
        // int result = dividend / 1; // this how you can retry to solve instead of
        // throwing an expection even in the
        // // siuation of databases;
        // System.out.println(result);
        // System.out.println(e);
        // }
        catch (Daya e) { // instead of using the general exception class we can also use our own
                         // exception like this..
            System.out.println(e);
        }
    }
}
