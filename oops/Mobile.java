public class Mobile {
    String brand;
    int price;
    String network;
    // static variable or static instance variables are memory efficient cause they
    // are present in static pool where all the static variable are present it can
    // be refered any time it does refered by object but donot use the memory of as
    // like instance variable of an object
    static String Type; // static variable
    // static values are dependant on class not on objects they shoulbe be called by
    // using the class name as its data type other wise it throughs warnings

    // constructor method

    // public Mobile() {
    // price = 100;
    // brand = "";
    // System.out.println("In constructor");
    // }

    // static method
    // the static methods are called first cause the class loader loads the class
    // and initiate the class along the static method and variable,later it goes for
    // the constructor when ever it sees a object creation is initiated and if we
    // donot create a object it won't call the static method tooo so we can call the
    // static method or initiate the class using
    // Class.forName("class name") <<----------this is the method for initiating
    // class without creation of the object

    // static {

    // System.out.println("in static");
    // }

    // this is a intance method which are activited when object is created, objects
    // are created each time for different parameters chage or for different object
    public void show() {
        System.out.println("brand: " + brand + "\n price: " + price + "\n  network:  " + network + "\n type: " + Type);
    }
    // in an instance method we can call a static varaible but in a static method we
    // need the refernce of object cause system get confused to refer an ojbect as
    // there many such are created so we need to specifically pass the object and
    // their properites prior calling them in the static method.

    // static methods are the methods which are non intance methos , they are loaded
    // when the class is loaded ,class only loads once

    public static void show1(Mobile obj) {
        System.out.println("brand: " + obj.brand + "\n price: " + obj.price + "\n  network:  " + obj.network
                + "\n type: " + Type);
        // here we are passing arguments as instance objects instance object or class
        // with a object refernece as obj ,parameters require the reference of ojbect
        // to get the data .. and statice variable can be accessed as they are avaialbe
        // in static pool area

    }

}
