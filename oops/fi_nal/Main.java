package fi_nal;

public class Main {
    public static void main(String[] args) {
        Final fi = new Final();
        //fi.price = 34;// here am trying to assign new value to the final variable but it show warning  uncomment it to see .
        int amount = fi.sell(234);
        System.out.println("The new price is "+ amount);
    }
    
}
