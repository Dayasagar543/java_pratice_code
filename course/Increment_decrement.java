public class Increment_decrement {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a++;
        System.out.println(a);
        int b = --a;//decrementing the value while fetching it #pre decrement
        System.out.println(b);
        System.out.println(a);
         b = a--;//decrementing the value after fetching it # post decrement
        System.out.println(b);
        System.out.println(a);
    }
}
