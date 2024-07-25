public class Array_operations {
    public int serach_value(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int serach_value_index(int[] array, int value, int starting_index) {
        for (int i = starting_index; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int frequeney_value_uo(int[] array, int value) {
        var count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    public int frequeney_value_o(int[] array, int value) {
        int i = 0, j = array.length - 1, count = 0;
        while (i <= j) {
            if (array[i] == value) {
                count++;
                i++;
            } else if (array[j] == value) {
                count++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return count;
    }

    public int sum_arrayValues(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public int sum_arrayValues_indexing(int[] array, int starting_index) {
        int sum = 0, i = starting_index, j = array.length - 1;
        // for (int i = starting_index; i < array.length; i++) {
        // sum += array[i];
        // }
        while (i < j) {
            sum += array[i];
            i++;
            sum += array[j];
            j--;
            if (i == j) {
                sum += array[i];
            }
        }
        return sum;
    }

    public void print_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
