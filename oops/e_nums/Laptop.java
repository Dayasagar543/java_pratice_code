package e_nums;

enum Laptop {
    Dell(1500), Hp(1200), Mac(1300), Lenovo(1100), Toshiba;
    // the above are objects with paramteres

    private int price;

    Laptop() {

    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}