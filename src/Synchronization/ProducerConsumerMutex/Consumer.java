package Synchronization.ProducerConsumerMutex;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private int maxSize;
    private String name;


    public Consumer(Queue<Object> queue, int maxSize, String name){
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            synchronized (queue) {
                if (queue.size() > 0) {
                    queue.remove();
                    System.out.println(this.name + ": Consume a shirt. " +
                            "New queue size: " + queue.size());
                }
            }
        }
    }
}
