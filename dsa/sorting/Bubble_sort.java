public class Bubble_sort {
    public void sort_bubble(int[] array) {
        Swap sw = new Swap();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1 - i; j++) {
                if (array[j - 1] > array[j]) {
                    sw.swap(array, j, j - 1);
                }
            }

        }
    }

}
