package src;

public class Multipleinterfaces implements x, Z {
    public void greet() {
        System.out.println("hi there how are you");
    }

    public void run() {
        System.out.println("hi there please flee away from the world");
    }

    public void show() {
        System.out.println("hi there this is from the show of multiple interfaces");
    }
}
// class can implement multiple interfaces just you need to define the methods
// mentioned int interfaces.

// when ever there is connection between class and interfaces its called
// ---------> implementataion
// when ever there is a connection between the class to class and interface to
// interface then it is calles---------> extends