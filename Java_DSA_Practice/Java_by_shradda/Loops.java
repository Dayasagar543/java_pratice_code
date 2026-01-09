public class Loops {
    public void forloop(int limit) {
        for (int i = 0; i < limit; i++) {
            System.out.println("hello world");
        }
    }

    public void whileloop(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println("hello world");
            i++;
        }
    }

    public void factorial(int value) {
        if (value < 0) {
            System.out.println("Invali input");
        }
        int result = 1;
        for (int i = 1; i <= value; i++) {

            result = result * i;
        }
        System.out.println(result);
    }
}
