package record_classes;

public class Main {
    public static void main(String[] args) {

        // using the record class
        Student1 s3 = new Student1(1, "Shalom", 34);
        Student1 s5 = new Student1(1, "Shalom", 34);
        // Student1 s4= new Student1(2, "Ramesh", 24);
        System.out.println(s3);
        System.out.println(s3.equals(s5));// equal method is always implemented
        System.out.println(s3.name());
        System.out.println(s3.getClass());
        System.out.println(s3.age());

        // using normal classes to transfer the data
        Student s1 = new Student(1, "Rahul", 31);
        Student s2 = new Student(1, "Rahul", 31);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));

    }
}