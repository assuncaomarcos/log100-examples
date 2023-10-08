package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Utils {

    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Erreur lors de la finalisation de l'executor");
        } finally {
            executor.shutdownNow();
        }
    }
}
