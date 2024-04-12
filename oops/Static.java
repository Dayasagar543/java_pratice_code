public class Static {
    public static void main(String[] args) {
        Mobile mb1 = new Mobile();
        Mobile.Type = "smart phone";
        mb1.brand = "samson";
        mb1.price = 20000;
        mb1.network = "Jio";
        Mobile mb2 = new Mobile();
        mb2.brand = "Apple";
        mb2.price = 18000;
        mb2.network = "docomo";
        Mobile mb3 = new Mobile();
        mb3.brand = "Black_berry";
        mb3.price = 25000;
        mb3.network = "airtel";
        Mobile mb4 = new Mobile();
        mb4.brand = "Nokia";
        mb4.price = 24000;
        mb4.network = "idea";

        mb1.show();
        mb2.show();
        mb3.show();
        mb4.show();

    }
};