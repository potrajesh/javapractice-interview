package com.threadstest.executorsservice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    Thread.sleep(1000);
                    return "Task 1";
                },
                () -> {
                    Thread.sleep(2000);
                    return "Task 2";
                },
                () -> {
                    Thread.sleep(3000);
                    return "Task 3";
                }
        );

        // Use invokeAll to execute all tasks and wait for all results
        List<Future<String>> results = executorService.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println("Result: " + result.get());
        }

        // Use invokeAny to execute tasks and get the first completed result
        String firstResult = executorService.invokeAny(tasks);
        System.out.println("First completed task result: " + firstResult);

        executorService.shutdown();
    }
}

