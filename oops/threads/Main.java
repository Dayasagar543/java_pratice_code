package threads;

public class Main {

    public static void main(String[] args) {
        // Runnable rn = new Run();//dynamic dispatch using the interface reference and
        // object or a concrete class
        // Runnable sw = new Show();

        Incre in = new Incre();

        Runnable rn1 = () -> {

            for (int i = 0; i <= 100000; i++) {
                // System.out.println("Run");
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {

                // e.printStackTrace();
                // }

                in.increment();

            }
        };

        Runnable rn2 = () -> {
            for (int i = 0; i <= 100000; i++) {
                // System.out.println("show");
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {

                // e.printStackTrace();
                // }

                in.increment();

            }
        };
        Thread t1 = new Thread(rn1);
        Thread t2 = new Thread(rn2);

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            //
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("printing the value of  " + in.value);

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
