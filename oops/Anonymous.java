public class Anonymous {
    public static void main(String[] args) {
        // Reference animal = new Reference(); we can create the object and call this
        // way or we can do the below way by delaring the type as show
        Reference obj;
        obj = new Reference();
        obj.setanimal("tiger");
        System.out.println(obj.getanimal());

        new Reference();// this new keyword will create the object in the heap and the reference
        // variable is created by using the class name as custom datatype..

        // anonymous object creation
        new Reference().setanimal("lion");

    }
}
