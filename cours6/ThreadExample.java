class MyThread extends Thread {

    public void run() {
        System.out.printf("Thread %d execute...\n", super.getId());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        int nthreads = 5;
        for (int i = 0; i < nthreads; i++) {
            Thread thread = new MyThread();
            thread.start();
        }
    }
}
