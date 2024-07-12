package collectio_n;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_api {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(21);
        data.add(41);
        data.add(56);
        data.add(78);
        data.add(121);
        System.out.println("printing the data added to integer list ");
        System.out.println(data);

        List<Integer> data2 = Arrays.asList(1, 2, 4, 5, 6, 7, 8);// we donot instanciate while using arrays
        System.out.println("printing the values of that are made using arrays.aslist method");
        System.out.println(data2);

        // int sum = 0;
        // for (Integer val : data2) {
        // if (val % 2 == 0) {
        // sum += val;
        // } else {
        // continue;
        // }
        // }
        // System.out.println(sum);
        data2.forEach(n -> System.out.print(n + " "));// callback methodoloy as js

        // streams
        Stream<Integer> s1 = data2.stream();
        s1.forEach(n -> System.out.println(n));
        // s1.forEach(n->System.out.println(n));//multiple usage of stream will not work
        // as it same as river water once passed by we cannot reverse or touch the same
        // water

        Stream<Integer> s2 = data.stream();// stream created
        Stream<Integer> s3 = s2.filter(n -> n % 2 != 0);// s2 stream is ended as it cannot be used multiple times and
                                                        // //s3 stream is crated after filtering the data
        System.out.println("printing onlyb the odd values");
        s3.forEach(n -> System.out.print(n + " ")); // s3 data is used for printing
        System.out.println();

        // Stream<Integer> st1 = data.stream();
        // Stream<Integer> st2 = st1.filter(n -> n % 3 == 0);
        // Stream<Integer> st3 = st2.map(n -> n * 5);
        // int st4 = st3.reduce(0, (c, e) -> c + e);
        // System.out.println("printing the sum of all the value in stream "+st4);

        // we can do all the above steps of stream in online

        System.out.println("printing the values");
        List<Integer> data4 = Arrays.asList(1, 23, 4, 5, 5, 6, 6, 7, 7);
        int result = data4.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c*2+e);
        System.out.println(result);

    }

}
