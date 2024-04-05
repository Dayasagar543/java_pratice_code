public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        // while loop
        int j = 0;
        while (j != 10) {
            System.out.println("hi world the value is   " + j);
            j++;
        }

        // do while
        int k = 4;
        do {
            System.out.println(" this is from do while loop  \t the value of k is  " + k);
            k++;
        } while (k <= 3);

        // nested loops

        for (int i = 0; i < 10; i++) {
            System.out.println("hi there from outer loop " + i);
            for (int l = 0; l <= 5; l++) {

                System.out.println("hi there from inner loop \n" + l);
            }
        }
    }
}
