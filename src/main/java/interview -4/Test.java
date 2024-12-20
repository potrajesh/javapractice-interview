import java.util.HashSet;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
public class Test{

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        HashSet<Callable<String>> objects = new HashSet<>();
        objects.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "call1";
            }
        });
        objects.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "call2";
            }
        });
        objects.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "call3";
            }
        });
        ExecutorService executorService = Executors.newFixedThreadPool(12);
        List<Future<String>> futures = executorService.invokeAll(objects);
         for (Future f:futures) {
             System.out.println(f.get());
         }

    }

}