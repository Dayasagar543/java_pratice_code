public class Array {

    public static void main(String[] args) {

        // static declartion of the array..
        int numbers[] = { 1, 2, 34, 5, 6, 7 };
        numbers[5] = 36;
        System.out.println(numbers[3]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
        System.out.println(numbers[5]);

        // dynamic delcaration of array
        int number[] = new int[7];
        number[0] = 3;
        number[1] = 4;
        number[2] = 5;
        number[3] = 6;
        number[4] = 7;
        number[5] = 8;
        // System.out.println(number[0]);
        // System.out.println(number[1]);
        // System.out.println(number[2]);
        // System.out.println(number[3]);
        // System.out.println(number[4]);

        for (int i = 0; i <= number.length; i++) {
            System.out.println("this is from the array    " + number[i]);
        }
    }

}
