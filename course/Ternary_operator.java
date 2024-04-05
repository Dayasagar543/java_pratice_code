public class Ternary_operator {
    public static void main(String[] args) {
        int divisor = 5;
        int dividend = 100;
        int result= dividend % divisor == 0 ? dividend/divisor: dividend/divisor;
        System.out.println(result);
    }
}
