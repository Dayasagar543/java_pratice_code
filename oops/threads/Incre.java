package threads;

class Incre {
    int value=0;

    public synchronized void increment() {
        value++;
    }

}