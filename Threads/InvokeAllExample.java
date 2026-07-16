import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllExample {
    public static void main(String[] args) {
        // Create a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Create a list of Callable tasks
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> {
            Thread.sleep(1000);
            return "Task 1 completed";
        });
        tasks.add(() -> {
            Thread.sleep(2000);
            return "Task 2 completed";
        });
        tasks.add(() -> {
            Thread.sleep(500);
            return "Task 3 completed";
        });

        try {
            // Invoke all tasks
            List<Future<String>> results = executorService.invokeAll(tasks);

            // Process the results
            for (Future<String> result : results) {
                System.out.println(result.get()); // Blocks until each task is complete
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor service
            executorService.shutdown();
        }
    }
}
