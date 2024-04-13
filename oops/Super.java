public class Super {
    public Super() {
        super();// this method is there in each constructor so that int can call the hiarcheal
                // parents objects util root objects if needed.
        System.out.println("in super class");
    }

    public Super(String val) {
        super();// this method is there in each constructor so that int can call the hiarcheal
                // parents objects util root objects if needed.
        System.out.println("in super class the number provided is " + val);
    }
}
