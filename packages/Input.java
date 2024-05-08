import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        try {

            // System.out.println("hi there please input the value ");
            // int in = System.in.read();
            // system.in //read------> method will give you the assci value as input so what
            // ever
            // you type on the key bouard it will be giving the corresponding ascii value
            // read method will give you only one character at a time soo
            // System.out.println(in - 48);

            // we can use buffer reader or a scanner class to do the input mechanism
            System.out.println("hi there please input the value for stream reader");
            InputStreamReader iin = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(iin);
            int number = Integer.parseInt(br.readLine());
            System.out.println(number);
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hi there input for scanner please");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);
    }

}
