package e_nums;

public enum Laptops {
    Dell(2000), Mac(300), Hp(800), Toshiba;

    private int price;

    Laptops() {

    }

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
