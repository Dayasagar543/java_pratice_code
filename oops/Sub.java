
public class Sub extends Super {
    public Sub() {
        super();// // this method is there in each constructor so that int can call the
        // hiarcheal even if not show its there for every constructor
        // parents objects util root objects if needed. this super method is the reason
        // we can ask the parent object the objects above to get the data..

        System.out.println("in sub class");
    }

    public Sub(String val) {

        this();
        System.out.println(val);
    }
}
