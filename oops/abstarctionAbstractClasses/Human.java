package abstarctionAbstractClasses;

public abstract class Human {// an abstract class can have abstract methods as well as non abstract
    // methods(general methods) 

    abstract void talk();// but for abstract methods the class should be only abstract

    public void heart_beat() {
        System.out.println("the heart is beating ");
    }
}

class Viday extends Human {// any class which extends an abstract class is called concrete class

    @Override
    void talk() {
        System.out.println("vidya says hi");
    }

}