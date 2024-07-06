package sta_tic;

public class Main {
    public static void main(String[] args) {
        Static st = new Static();

        Static.setId_num("Id_E292394");
        String id = Static.getId_num();
        System.out.println("The id assigned is " + id);

        Static.name = "Rahul";// static variables are accessed using the class name only
        Static.setName("Manish");
        st.setAge(21);
        Static.setId_num("Id_E292393");
        String name = Static.getName();
        System.out.println("the name is : " + name);
        int age = st.getAge();
        System.out.println("The age is : " + age);
        String id1 = Static.getId_num();
        System.out.println("The id is : " + id1);

        // st.setName();//cannot call a static method in this way static methods should
        // only be called using the class name
    }

}
