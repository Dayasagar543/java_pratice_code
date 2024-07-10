package user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainbuf {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("printing the values using print stream which is statically declared");
        // try {
        // System.out.println("please press the key you want to know the ascii value of
        // ");
        // int val = System.in.read();// this method will give the ascii values for the
        // input soo we donot use it and
        // // it only gives int values and for us to read all the continuous values we
        // need
        // // to for loop . instead of this we use buffer reader or scanner class
        // System.out.println(val);
        // } catch (IOException e) {

        // e.printStackTrace();
        // }
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = null; // buffer reader can take input from any where like files ,keyboard
                                  // , internet sorces etc
        try {
            br = new BufferedReader(in);
            int value = Integer.parseInt(br.readLine());// readline give string input and there are other methods also
                                                        // like read which will give int input
            System.out.println(value);

        }
        // catch (Exception e) {
        // System.out.println(e);
        // }
        finally {// finally is used irrespcetive of exception this will get executed irresective
                 // of exception also used for closing the resources like databases connection
                 // ,network etc .
            System.out.println("bye");
            br.close();
        }

    }

}
