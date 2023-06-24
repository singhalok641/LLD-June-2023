package Synchronization.staticSynchronization;

public class StaticCounter {
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public synchronized int getCount() throws InterruptedException {
        // Adding delay to simulate some processing
        Thread.sleep(10);
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        StaticCounter counter = new StaticCounter();

        // Thread 1 calls increment 1,000,000 times
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                StaticCounter.increment();
            }
        });

        // Thread 2 calls getCount
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Count value: " + counter.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        System.out.println("Final count value: " + counter.getCount());
    }
}