package com.threadstest.executorsservice;

import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.Arrays;

public class CompletableFutureFileProcessingExample {

    public static void main(String[] args) {
        // List of file paths to process
        List<String> files = Arrays.asList("file1.txt", "file2.txt", "file3.txt", "file4.txt");

        // Process each file asynchronously and collect the futures
        List<CompletableFuture<String>> futures = files.stream()
            .map(filePath -> CompletableFuture.supplyAsync(() -> processFile(filePath)))
            .toList();

        // Wait for all tasks to complete
        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

        // When all are done, collect the results
        allOf.thenRun(() -> {
            futures.forEach(future -> {
                try {
                    String result = future.join(); // Get result of each file processing
                    System.out.println("Processing result: " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }).join(); // Block main thread until all tasks complete
    }

    // Sample file processing method, which simulates processing with a delay
    public static String processFile(String filePath) {
        System.out.println("Processing " + filePath + " in " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate time-consuming processing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Processed " + filePath;
    }
}
