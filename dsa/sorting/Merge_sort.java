public class Merge_sort {
    public void merge(int[] array, int left, int mid, int right) {
        int length_left = mid - left + 1;
        int length_right = right - mid;
        int[] leftarray = new int[length_left];
        int[] rightarray = new int[length_right];
        for (int i = 0; i < length_left; i++) {
            leftarray[i] = array[left + i];
        }
        for (int j = 0; j < length_right; j++) {
            rightarray[j] = array[mid + 1 + j];
        }

        int k = 0;
        int l = 0;
        int m = left;
        while (k < length_left && l < length_right) {
            if (leftarray[k] <= rightarray[l]) {
                array[m] = leftarray[k];
                k++;
            } else {
                array[m] = rightarray[l];
                l++;
            }
            m++;
        }
        while (k < length_left) {
            array[m] = leftarray[k];
            k++;
            m++;
        }
        while (l < length_right) {
            array[m] = rightarray[l];
            l++;
            m++;
        }
    }

    public void sort_merge(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + right / 2;
            sort_merge(array, left, mid);
            sort_merge(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

}
