package collectio_n;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
// import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
// import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>(); // If you want to implement index based array use list as
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

        // printing the arraylist using the index and methods provided for list
        System.out.println("printing the value at a index " + nums.get(3));
        System.out.println("The index of input value is " + nums.indexOf(6));
        System.out.println("the size of the list is " + nums.size());
        // Below code is used when the type is not specified

        // for (Object value : nums) {
        // int num = (Integer) value;
        // System.out.println(num * 3);
        // }

        // Set<Integer> data = new HashSet<Integer>();
        Set<Integer> data = new TreeSet<Integer>();

        data.add(45);
        data.add(2);
        data.add(32);
        data.add(32);
        data.add(50);
        data.add(50);
        data.add(1);
        System.out.println(data);// here we will get sorted data as we are using TreeSet
        System.out.println("Printing the size of the array " + data.size());
        System.out.println("Is the array empty : " + data.isEmpty());
        // System.out.println(data.iterator());
        Iterator<Integer> values = data.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
        System.out.println(data.remove(2));
        System.out.println(data);

        // Maps in collection
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();// is the synchornised version of hashmap
        students.put("Naveen", 23);
        students.put("kiran", 56);
        students.put("Mani", 40);
        students.put("Sharath", 15);
        students.put("Harsh", 57);
        System.out.println("printing the values of hashmap using the map interface " + students);
        System.out.println(students.keySet());
        System.out.println(students.values());
        System.out.println(students.get("Sharath"));

        for (String student : students.keySet()) {
            System.out.println(student + ":" + students.get(student));
        }

        // sorting the collection
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(24);
        nums1.add(33);
        nums1.add(87);
        nums1.add(78);
        System.out.println(nums1);
        Collections.sort(nums1);
        System.out.println(nums1);

        Comparator<Integer> cp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };

        Collections.sort(nums1, cp);
        System.out.println("printing the unit digit sort");
        System.out.println(nums1);

        List<String> data1 = new ArrayList<String>();
        data1.add("Suri");
        data1.add("Mahesh");
        data1.add("Rajendar");
        data1.add("Naren");

        Comparator<String> compare = new Comparator<String>() {// is an interface and here we are writing an anonymous
                                                               // class

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return -1;
                }

            }

        };

        Collections.sort(data1, compare);
        System.out.println(data1);

        List<Students> data3 = new ArrayList<>();
        data3.add(new Students(38, "Suresh"));
        data3.add(new Students(21, "Vidyasagar"));
        data3.add(new Students(37, "Rajendar"));
        data3.add(new Students(22, "shalom"));
        System.out.println(data3);

        Comparator<Students> cp1 = (Students o1, Students o2) -> {
            // if (o1.age > o2.age) {
            // return 1;
            // } else {
            // return -1;
            // }
            return o1.age > o2.age ? 1 : -1;
        };

        // Comparator<Student> co=(o1,o2)->i>j?1:-1;  //this short hand code 
        Collections.sort(data3, cp1);
        System.out.println(data3);
    }

}
