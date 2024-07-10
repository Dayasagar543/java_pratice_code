package encapsulation;

public class Main {
    public static void main(String[] args) {
        Car ca = new Car();
        ca.setModelName("pagani");
        ca.setRate(15000000);
        ca.setLifetime(24);

        System.out.println("printing the model details");
        System.out.println("The brand of the car "+ca.getModelName());
        System.out.println("The price of the car "+ca.getRate());
        System.out.println("The life time of the car "+ca.getLifetime());
        ;
    }
}
