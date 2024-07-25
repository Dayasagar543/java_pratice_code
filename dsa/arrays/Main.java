
public class Main {
    public static void main(String[] args) {
        Array_operations ar = new Array_operations();
        int[] array_input = { 1, 2, 3, 4, 5 };
        int result = ar.sum_arrayValues_indexing(array_input, 0);
        System.out.println("the sum of the values of the array  " + result);
        int result1 = ar.sum_arrayValues_indexing(array_input, 2);
        System.out.println("the sum of the values of the array from index is  " + result1);

        int[] array_input1 = { 1, 2, 3, 4, 5, 5, 6, 7, 5, 5, 4, 5, 5, 6, 5, 6, 5, 4, 4, 55, 5, 5, 5, 5, 5, 5 };
        int count_5 = ar.frequeney_value_o(array_input1, 5);
        System.out.println("the count of the value input is " + count_5);

        int[] sorted_data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 19, 21, 22, 24,
                25 };
        Binary_search bs = new Binary_search();
        int binary_value = bs.binary_search(sorted_data, 9);
        System.out.println("The index of the value   " + binary_value);
    }
}
