public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int result2 = cal.add(34, 20);
        System.out.println(result2);

        int mul_result = cal.mul(34, 21);
        System.out.println(mul_result);

        int resutl = add(2, 3);
        System.out.println("The result from the main static method is   " + resutl);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
