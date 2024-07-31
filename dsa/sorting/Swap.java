public class Swap {
    public void swap(int[] array, int a, int b) {
        // just for intergers this can be used
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // the below code can create issues when used with zero and only on arrays
        // array[a] = array[a] + array[b];
        // array[b] = array[a] - array[b];
        // array[a] = array[a] - array[b];

        // the below code will even work with zeros use this only
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
