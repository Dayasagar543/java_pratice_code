package threads;

public class Run implements Runnable { // or extends Thread

    public void run() {
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Run");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
// in a thread there should always a run it is mandatory as there is trigger
// called start the method starts running

// or you can go for Runable interface implementing
// eg Run implements Ruanable as the thread implements Runable we can direclty
// use the runnable instead of extending the thread class
