package user_input;

import java.util.Scanner;

public class Mainsca {
    public static void main(String[] args) {
         
        System.out.println("please input date of birth only provide the day");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);
        sc.close();

    }
}
