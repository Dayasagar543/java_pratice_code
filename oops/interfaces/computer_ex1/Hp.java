package interfaces.computer_ex1;

public class Hp implements Computer {

    @Override
    public void start() {

        System.out.println("starting the computer");
    }

    @Override
    public int nums() {
        System.out.println("on key press of numbers");
        return 1;
    }

    @Override
    public char alphabets() {
        System.out.println("On key press of alphabets");
        return 'c';
    }

    @Override
    public void stop() {
        System.out.println("stoping the computer");
    }

}
