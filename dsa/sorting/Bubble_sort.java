
public class Bubble_sort {
    Swap sw = new Swap();
    Array_operations ao = new Array_operations();

    public void sort_bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                // if (array[j] > array[j + 1]) {
                if (array[j-1] > array[j]) {
                    // int temp = array[j];
                    // array[j] = array[j + 1];
                    // array[j + 1] = temp;
                    sw.swap(array, j, j-1);
                }
            }
            // ao.print_array(array);
        }

    }
}
