public class Mobile {
    String brand;
    int price;
    String network;
    // static variable or static instance variables are memory efficient cause they
    // are present in static pool where all the static variable are present it can
    // be refered any time it does refered by object but donot use the memory of as
    // like instance variable of an object
    static String Type;
    // static values are dependant on class not on objects they shoulbe be called by
    // using the class name as its data type other wise it throughs warnings

    // constructor method

    // public Mobile() {
    // price = 100;
    // brand = "";
    // System.out.println("In constructor");
    // }

    // static mehthod

    // static {
    // System.out.println("in static");
    // }

    public void show() {
        System.out.println("brand: " + brand + "\n price: " + price + "\n  network:  " + network + "\n type: " + Type);
    }

}
