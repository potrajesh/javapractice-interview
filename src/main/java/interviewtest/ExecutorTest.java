import java.util.HashSet;
import java.util.List;
import java.util.concurrent.*;

class ExecutorTest{

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        HashSet<Callable<String>> callables = new HashSet<>();
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "call1";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "call2";
            }
        });
        ExecutorService executorService = Executors.newFixedThreadPool(12);
        List<Future<String>> futures = executorService.invokeAll(callables);
        for (Future f:futures){
            System.out.println(f.get());
        }
    }
}