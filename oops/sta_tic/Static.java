package sta_tic;

public class Static {
    private int age;// instance variable
    static String name; // static variable
    static String id_num;

    public int getAge() {
        return age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Static.name = name;// static variables are called by the class name and are auto generated when
                           // done with ide
    }

    public static String getId_num() {
        return id_num;
    }

    public static void setId_num(String id_num) {
        Static.id_num = id_num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void setName() {
        System.out.println("Inside the setName function");
    }

}
