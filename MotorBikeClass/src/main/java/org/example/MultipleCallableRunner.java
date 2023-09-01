package org.example;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> tasks = List.of(new CallableTask("in28minutes"),new CallableTask("in29minutes"), new CallableTask("Ranga"));
        //Future is a promise that we will have a answer in the future
        List<Future<String>> results = executorService.invokeAll(tasks);
        //waiting for the result
        for(Future<String> result:results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
