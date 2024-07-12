package collectio_n;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>(); // If you want to implement index based arrray use list as
                                                             // it supports indexing
        // Collection nums = new ArrayList(); // can do this way also without declaring
        // the sepcific type
        nums.add(25);
        nums.add(6);
        nums.add(7);
        nums.add(9);
        nums.add(21);
        nums.add(81);
        // nums.add("8");// this would create runtime exception so to avoid error at
        // runtime we specify
        // the Type using the class of spcific type like <Interger>
        System.out.println(nums);
        for (Object object : nums) {
            System.out.println(object);
        }


        //printing the arraylist using the index
        System.out.println("printing the value at a index "+nums.get(3));
        System.out.println("The index of input value is "+nums.indexOf(6));
        System.out.println("the size of the list is "+ nums.size());
        // Below code is used when the type is not specified

        // for (Object value : nums) {
        // int num = (Integer) value;
        // System.out.println(num * 3);
        // }

    }

}
