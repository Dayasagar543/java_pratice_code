package local_variable_type_inference;

class Aline {
    String name = "Rahul";
    int age = 21;

}

public class Main {
    public static void main(String[] args) {
        int i = 5;// we can declare the variable without initilizing it..
        System.out.println("using the type declaration keyword int " + i);

        var j = 5;// var as datatype to a variable should always be assigned /initialised and we
                  // cannot use at the instance level or class name too ...
        System.out.println("using the var key word  " + j);

        String var = "shalom";// var can be used as variable
        System.out.println("Can be used as variable " + var);

        // old syntax of arrays
        int[] nums1 = new int[10];
        // declaring array with var
        var nums = new int[10];

        // object
        var obj = new Aline();
        System.out.println("the name of the person " + obj.name);
        System.out.println("the age of the person is " + obj.age);

    }

}
