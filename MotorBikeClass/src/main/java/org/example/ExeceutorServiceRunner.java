package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExeceutorServiceRunner {
    public static void main(String[] args) {
        //only executes on thread at the time
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        executorService.shutdown();
    }
}
