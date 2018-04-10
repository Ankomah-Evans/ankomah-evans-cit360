
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ankomah
 */
public class threadRunnablesExecutors {

    public static void main(String args[]) {

        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        R1.run();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}

class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo(String Name) {
        String name = null;
        threadName = name;
        System.out.println("This creates thread" + threadName);
    }

    public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 4; i > 0; i --){
                System.out.println("Thread: " + threadName + " " + i);
                // thread will sleep for some time
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + "interrupted.");
        }
        System.out.println("Thread " + threadName + "existing.");
    }

    public void start() {
        System.out.println("Starting" + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }

    }

}
