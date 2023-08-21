class Counter {
    private int c = 0;

    public void increment() { c++; }
    public void decrement() { c--; }
    public int value() { return c; }
}

class CountingThread extends Thread {
    private Counter counter;
    private boolean increment;  // Utilisé pour savoir si le thread increment ou devcrement le compteur
    private int times;

    CountingThread(Counter c, boolean inc, int times) {
        this.counter = c;
        this.increment = inc;
        this.times = times;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            if (increment)
                counter.increment();
            else
                counter.decrement();
        }
    }
}

public class WithoutSynchronization {

    public static void main(String[] args) {
        int times = 10000;
        Counter counter = new Counter();

        Thread t1 = new CountingThread(counter, true, times);
        Thread t2 = new CountingThread(counter, false, times);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Compteur: " + counter.value());
    }
}