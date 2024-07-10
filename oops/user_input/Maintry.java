package user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maintry {
    public static void main(String[] args) throws NumberFormatException, IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(null))) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }
    }

}
