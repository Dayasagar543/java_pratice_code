package Exceptions;

public class Error extends Exception {
    public void exceptions(int a, int b) {
        try {
            int[] arr = new int[5];
            int c = a / b;
            System.out.println(c);

            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) { // we can write multiple exceptions for the condition in the try block.
            System.out.println("something went wrong!!" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
