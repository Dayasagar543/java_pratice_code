package lamda_expressions;

public class Main {
    public static void main(String[] args) {
        // we cannot instanciate the ojbect of interfaces but we can create anonymous
        // classe to them instead defining a concrete class for the methods to be
        // implemented.. below is the sytax of anonymous class implemenation using
        // interfaces

        // using lamda expressions we are creating the anonymous classes of the
        // interfaces this also called the syntactical sugar as this is reducing the
        // code
        Fan fn = () -> {
            System.out.println(" Hi there from lamda expressions");
        };
        fn.turnOnOffFan();// this how we call using the object but the implementation of lambda expession
                          // is above interms of functional interfaces

        // this is genereal method without lamda classes
        House_inteface Hi = new House_inteface() {

            @Override
            public void open_door() {

                System.out.println("opening the door");
            }

            @Override
            public void close_door() {

                System.out.println("closing the door");
            }

            @Override
            public int turn_on_switch() {
                System.out.println("turning on the switch");
                return 1;
            }

            @Override
            public int turn_off_switch() {
                System.out.println("turning of the switch");
                return 0;
            }

        };

        Hi.close_door();
        Hi.open_door();

        // utilisting the ternary operator
        int val1 = Hi.turn_on_switch();
        boolean sw;
        if (val1 == 1) {
            sw = true;
        } else {
            sw = false;
        }
        boolean val = sw ? true : false;
        System.out.println("The switch is turned on " + val);
    }

}
