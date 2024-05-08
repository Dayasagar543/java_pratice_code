package src.exceptions;

public class Throws {
    // throws is use when exceptions is to be handled by the above layers of code
    // from where the excepiton is generated
    public void show() throws ClassNotFoundException {
        Class.forName("Zen");
    }
}
