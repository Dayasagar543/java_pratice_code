public class Binary_search {
    public int binary_search(int[] array, int target) {
        int start = 0, end = array.length - 1, middle_value;
        while (start <= end) {
            middle_value = start + (end - start) / 2;
            if (target > array[middle_value]) {
                start = middle_value + 1;
            } else if (target < array[middle_value]) {
                end = middle_value - 1;
            } else if (target == array[middle_value]) {
                return middle_value;
            }

        }
        return -1;
    }
}
