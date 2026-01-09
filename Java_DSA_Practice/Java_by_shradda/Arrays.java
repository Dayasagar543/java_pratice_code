public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[6];
        marks[0] = 93;
        marks[1] = 93;
        marks[2] = 87;
        marks[3] = 67;
        print_array(marks);
    }

    public static void print_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
