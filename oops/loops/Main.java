package loops;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // for loop
        System.out.println("printing the data using the for loop");
        int nums[] = new int[7];
        nums[0] = 7;
        nums[1] = 8;
        nums[2] = 9;
        nums[3] = 10;
        nums[4] = 19;
        nums[5] = 23;
        nums[6] = 34;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("printing the data using for each method");

        // for each
        List<Integer> nums1 = Arrays.asList(1, 23, 4, 5, 45, 66, 7, 765, 4, 3, 3, 3);
        nums1.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // enhanced for loop
        System.out.println("printing the data using advanced for loop");
        for (Integer value : nums1) {
            System.out.print(value + " ");
        }
    }
}
