package e_nums;

public class Main {
    public static void main(String[] args) {
        Laptops lap = Laptops.Dell;
        System.out.println("priting the price of dell constant  " + lap.getPrice());

        for (Laptops lap1 : Laptops.values()) {
            System.out.println(lap1+" : "+lap1.getPrice());
        }
    }

}