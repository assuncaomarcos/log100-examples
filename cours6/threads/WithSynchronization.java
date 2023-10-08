package threads;

class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() { c++; }
    public synchronized void decrement() { c--; }
    public int value() { return c; }
}

class SunchronizedCountingThread extends Thread {
    private SynchronizedCounter counter;
    private boolean increment;  // Utilisé pour savoir si le thread increment ou devcrement le compteur
    private int times;

    SunchronizedCountingThread(SynchronizedCounter c, boolean inc, int times) {
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

public class WithSynchronization {

    public static void main(String[] args) {
        int times = 20000;
        SynchronizedCounter counter = new SynchronizedCounter();

        Thread t1 = new SunchronizedCountingThread(counter, true, times);
        Thread t2 = new SunchronizedCountingThread(counter, false, times);
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
