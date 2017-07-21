package OldProjects.day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Main {
    public static void main(String[] args) {
//        runnableThread();
//        executors();
        synchronize();
    }

    private static void runnableThread() {
        HelloRunnable hR = new HelloRunnable();
        hR.run();
        hR.run();

        Thread t = new Thread(hR);
        t.start();
        System.out.println(t.getName());

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Yo" + Thread.currentThread().getName());
            }
        });
        t2.start();


    }

    private static void executors() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("I am " + threadName);
            }
        });
        executor.shutdown();
        System.out.println("Executor ordered to shut down");

    }

    private static void synchronize() {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
    }
}
