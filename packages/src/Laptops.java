package src;

public enum Laptops {
    macbook(2000), hp(1500), thinkpad(2500), thinkstaion(2000), dell;

    private int price;

    private Laptops() {
    }

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
