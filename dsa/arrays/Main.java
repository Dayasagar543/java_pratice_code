
public class Main {
    public static void main(String[] args) {
        Array_operations ar = new Array_operations();

        int[] array_input = { 1, 2, 3, 4, 5 };
        int result = ar.sum_arrayValues_indexing(array_input, 0);
        System.out.println("the sum of the values of the array " + result);
        int result1 = ar.sum_arrayValues_indexing(array_input, 2);
        System.out.println("the sum of the values of the array from index is " +
                result1);

        int[] array_input1 = { 1, 2, 3, 4, 5, 5, 6, 7, 5, 5, 4, 5, 5, 6, 5, 6, 5, 4,
                4, 55, 5, 5, 5, 5, 5, 5 };
        int count_5 = ar.frequeney_value_o(array_input1, 5);
        System.out.println("the count of the value input is " + count_5);

        // binary search
        int[] sorted_data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18,
                19, 21, 22, 24,
                25 };

        Binary_search bs = new Binary_search();
        int binary_value = bs.binary_search(sorted_data, 9);
        System.out.println("The index of the value " + binary_value);

        // bubble sort
        int[] array_bubble_sort = { 3, 2, 4, 5, 7, 1, 3, 4, 6, 8, 98, 8, 7, 6, 6, 5,
                5, 4, 4, 7 };

        Bubble_sort bst = new Bubble_sort();
        // 1
        System.out.println("array before sorting ");
        ar.print_array(array_bubble_sort);

        bst.sort_bubble(array_bubble_sort);

        System.out.println("array after sorting");
        ar.print_array(array_bubble_sort);
        // 2
        System.out.println("array before sorting ");
        ar.print_array(array_input1);

        bst.sort_bubble(array_input1);

        System.out.println("array after sorting");
        ar.print_array(array_input1);

        // selection sort
        int[] array_selection = { 5, 43, 2, 2, 2, 3, 0, 5, 6, 56, 1 };
        Selection_sort ss = new Selection_sort();

        System.out.println("array before sorting using the selection sort");
        ar.print_array(array_selection);

        ss.sort_selection(array_selection);

        System.out.println("array after sorting using the selection sort");
        ar.print_array(array_selection);

        // insertion sort
        Insertion_sort si = new Insertion_sort();
        int[] array_insertion_sort = { 34, 65, 78, 98, 2, 1, 12, 32, 3 };
        System.out.println("array before sorting using the insertion sort");
        ar.print_array(array_insertion_sort);
        si.sort_insertion(array_insertion_sort);
        System.out.println("array after sorting using the insertion sort");
        ar.print_array(array_insertion_sort);

    }
}
