import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureFileExample {

    public static void main(String[] args) {
        // Define input and output file paths
        Path inputFile = Paths.get("D:\\files\\input.txt");
        Path outputFile = Paths.get("D:\\files\\output.txt");

        // 1. Read file asynchronously
        CompletableFuture<String> readFileFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Reading file: " + inputFile);
                return Files.readString(inputFile); // Read file content
            } catch (IOException e) {
                throw new RuntimeException("Error reading file: " + e.getMessage());
            }
        });

        // 2. Write file content without modification
        CompletableFuture<Void> writeFileFuture = readFileFuture.thenAcceptAsync(content -> {
            try {
                System.out.println("Writing to file: " + outputFile);
                Files.writeString(outputFile, content); // Directly write content
            } catch (IOException e) {
                throw new RuntimeException("Error writing file: " + e.getMessage());
            }
        });

        // 3. Handle success and exceptions
        writeFileFuture
                .thenRun(() -> System.out.println("File processing completed successfully!"))
                .exceptionally(ex -> {
                    System.err.println("Error occurred: " + ex.getMessage());
                    return null;
                });

        // Prevent JVM from exiting immediately (optional for demo purposes)
        try {
            Thread.sleep(3000); // Wait for tasks to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
