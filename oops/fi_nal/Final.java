package fi_nal;

public class Final {
    final int price = 200;// final keyword is used when you want to make the variable constant
    int new_price;

    final public int sell(int price) { // final keyword on the method avoids method overriding
        return this.new_price = price;
    }

}
