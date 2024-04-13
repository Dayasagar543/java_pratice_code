public class Encapsulation {
    public static void main(String[] args) {
        Human man = new Human();
        // assigning the values to the private variables using getters and setters

        // setters
        man.setname("Srikanth");
        man.setgender("male");
        man.setroll_no(16);

        // getters
        System.out.println(man.getname());
        System.out.println(man.getgender());
        System.out.println(man.getroll_no());
    }
}
