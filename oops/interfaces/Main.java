package interfaces;

import interfaces.computer_ex1.*;
import interfaces.functional_interfaces.Functional_interface;
import interfaces.functional_interfaces.Interface;

public class Main {
    public static void main(String[] args) {

        Computer cp = new Hp(); // code for computer interface
        cp.start();

        Functional_interface fn = new Interface();
        fn.run();

    }

}
