class MyRunnable implements Runnable {

    public void run() {
        System.out.printf("Thread %d execute...\n", Thread.currentThread().getId());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        int nthreads = 5;
        for (int i = 0; i < nthreads; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}