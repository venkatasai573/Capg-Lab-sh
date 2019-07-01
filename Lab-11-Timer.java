package com.cg.lab11;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author sai
 */
public class Timer {

    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();

        executor.execute(new Runnable() {
            @Override
            public void run() {
                long start_time = System.currentTimeMillis();
                while (true) {
                    long current_time = System.currentTimeMillis() - start_time;

                    long seconds = (current_time / 1000) % 60;
                    long minutes = (current_time / 1000) / 60;

                    System.out.println(seconds + " seconds , " + minutes + " minutes.");

                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ex) {
                        System.out.println("Timer interrupted");
                    }
                }
            }
        });
    }
}
