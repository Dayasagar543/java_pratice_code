public class Selection_sort {
    public void sort_selection(int[] array) {
        Swap sw = new Swap();
        Array_operations ao = new Array_operations();
        int min = -1;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            sw.swap(array, min, i);
            // ao.print_array(array);
        }
    }
}
