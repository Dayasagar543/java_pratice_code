package record_classes;

//canonical constructor this will create all the required things for data transfer all the methods
public record Student1(int s_no, String name, int age) implements Cloneable {// all the parameters being passed into the
                                                                             // function are private
                                                                             // final and also can implement interfaces
    public Student1 {
        if (s_no == 0)
            throw new IllegalArgumentException();
    }

    // you can write all the methods if you want
    public void show() {
        System.out.println(name);
    }

}