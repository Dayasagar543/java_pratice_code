public class Jagged_array {
    public static void main(String[] args) {
        // we can create multi dimensional array inside array like 3d ,4d, d=dimension
        // like array in array ...
        int array[][] = new int[3][4];
        int array1[][] = new int[4][3];
        // jagged arrays are the arrays with different array length arrayged in an outer
        // array.

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);// can also multiply by 10 to get single numbers
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array[j][i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println(" \n");
        }

        System.out.println("this is from the rotated array \n");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "  ");
            }
            System.out.println(" \n");
        }
    }
}
