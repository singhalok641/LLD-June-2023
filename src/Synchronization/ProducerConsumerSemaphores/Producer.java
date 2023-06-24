package Synchronization.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Queue<Object> queue;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;


    public Producer(Queue<Object> queue, int maxSize, String name,
                    Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }


    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queue.add(new Object());
            System.out.println(this.name + ": Adding a shirt. " +
                    "New queue size: " + queue.size());
            consumerSemaphore.release();
        }
    }
}
