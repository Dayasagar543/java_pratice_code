package interfaces.functional_interfaces;

@FunctionalInterface // functional interface--------> sam (single abstract method interface) that we
                     // can only define one method and the annotation @functionalinterface helps such
                     // that we donot write any extra methods even if we write it throw errors and
                     // warnings
public interface Functional_interface {

    // we can use the code like --------------> public abstract void show(); but
    // they are not necessary as they are defaultly added in the interfaces
    void run();
}
