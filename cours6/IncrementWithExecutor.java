import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class IncrementWithExecutor {
    int count = 0;

    synchronized void increment() {
        count = count + 1;
    }

    int value() {
        return count;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        IncrementWithExecutor counter = new IncrementWithExecutor();

        IntStream.range(0, 20000).forEach(i -> executor.submit(counter::increment));
        Utils.stop(executor);

        System.out.println("Compteur: " + counter.value());
    }
}
