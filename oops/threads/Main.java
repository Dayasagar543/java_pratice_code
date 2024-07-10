package threads;

public class Main {
    public static void main(String[] args) {
        // Runnable rn = new Run();//dynamic dispatch using the interface reference and
        // object or a concrete class
        // Runnable sw = new Show();

        Runnable rn1 = () -> {

            for (int i = 0; i < 20; i++) {
                System.out.println("Run");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };

        Runnable rn2 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("show");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(rn1);
        Thread t2 = new Thread(rn2);

        t1.start();
        t2.start();

        // the below code works with extended class of thread

        // rn.start();// start should be the name to all the thread to say start
        // sw.start();
        // rn.getPriority();// we can get the priority of the thread by using the
        // realated object and method
        // rn.setPriority(Thread.MAX_PRIORITY); // You can set priority higest 10 min is
        // 1 this is suggestion to the
        // // scheduler at cpu to run we cann really set but can suggest

    }

}
