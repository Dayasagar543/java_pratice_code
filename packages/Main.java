import other.Variables;
import src.*;
import up_down_casting.*;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.show(4));
        Variables obj = new Variables();
        obj.setname("Rahul");
        System.out.println(obj.getname());
        System.out.println(obj.toString());// defaultly even without we call an object toString method is there and
                                           // called defaultly..
        Final fn = new Final();
        System.out.println(fn.show2());

        // code practice on up_down_casting
        // Upper_class up = new Upper_class();
        // System.out.println(up);

        // the code is up casting below;

        Upper_class up = new Lower_class();
        up.show1();

        // the code for low casting is below;
        Lower_class lw = (Lower_class) up;
        lw.show2();

        // code for Interger ,char,float other data type classes provided by java

        int val = 8;
        Integer num1 = val; // auto boxing <---------- when wrapper variable is assigned with primitive
                            // values
        System.out.println(num1);

        int num2 = num1; // auto unboxing<-----------when the primitive variables are assinged with
                         // wrapper variables
        System.out.println(num2);

        String str = "12";
        int val1 = Integer.parseInt(str);
        System.out.println(val1 * 12);

        // for abstract methods and classes you cannot create objects but you can create
        // the objects for the extended classes.

        Wagnor wango = new Wagnor();
        wango.run();
        wango.change_gear();

        // Inner classes that means class in side the class

        // Inner_class obj1 = new Inner_class();
        // obj1.show();
        // to call the method from the inner classes.
        // Inner_class.Innerclass obj3 = obj1.new Innerclass();
        // obj3.config();

        // if the inner class is static then we can call them by using the classname
        // without the object creation
        Inner_class.Innerclass obj3 = new Inner_class.Innerclass();
        obj3.config();

        // we cannot make the outer class static it throws error as illegal modifier

        // Anonymous inner classes
        // these anonyomous classes are created if only once they are used like not used
        // in other files .

        Anonymous_Innerclass an = new Anonymous_Innerclass() {
            // this is the anonymous class
            @Override
            public void show() {
                System.out.println("hi from the anonymous class created at main \n");
                super.show();
            }

            public void tell() {
                System.out.println("hi there from the main here to tell hi");
            }

        };
        an.show();

        // interfaces example here..

        Computer comp = new Desktop();
        Computer comp1 = new Laptop();

        Developer dev = new Developer();
        dev.dev(comp1);
        dev.dev(comp);

        // class implementing multiple interfaces

        Multipleinterfaces mi = new Multipleinterfaces();
        mi.run();
        mi.show();

        System.out.println(x.age);
        System.out.println(x.name);
    }

}