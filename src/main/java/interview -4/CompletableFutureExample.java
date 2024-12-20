import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;

class CompletableFutureExample{
    public static void main(String[] args) {
        Path input = Paths.get("D://files/input.txt");
        Path output = Paths.get("D://files/output.txt");
        //read content
        CompletableFuture<String> objectCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Files.readString(input);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
       //

    }
}