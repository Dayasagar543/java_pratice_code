package src;

abstract class Car {
    // abstract methods donot have body their defination is metion in their extended
    // classes. And also the abstract methods need to be implemented only in
    // abstract class but its is not necessary to implete abstract methods in
    // abstract class you can also have other methods implemented in the abstract
    // classes;

    public abstract void run();

    public abstract void change_gear();// abstract class

    public void play_music() {
        System.out.println("playing music");
    }
}

public class Wagnor extends Car {// this is a concrete class as it is extended from a abstract class where you
                                 // implement the abstract methods bodies as well as any other methods if
                                 // necesssary
    public void run() {
        System.out.println("the engine is already running");
    }

    public void change_gear() {
        System.out.println("shifting the gear automatically");
    }
    // its always important to implement all the methods
}