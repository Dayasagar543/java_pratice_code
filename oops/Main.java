public class Main {

    public static void main(String[] args) {

        // calling the class
        Calculator cal = new Calculator();

        // calling the addd method from the calculator class using the object cal
        int result1 = cal.add(34, 20);
        System.out.println(result1);

        int result1_1 = cal.add(4, 5, 7);
        System.out.println(result1_1);

        int result2 = cal.subtraction(2, 4);
        System.out.println(result2);

        int result3 = cal.mul(34, 21);
        System.out.println(result3);

        int result4 = cal.div(4, 2);
        System.out.println(result4);

        int result5 = cal.remainder(4, 2);
        System.out.println(result5);

        int resutl = add(2, 3);
        System.out.println("The result from the main static method is   " + resutl);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
