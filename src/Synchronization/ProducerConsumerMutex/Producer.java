package Synchronization.ProducerConsumerMutex;

import java.util.Queue;

public class Producer implements Runnable{

    private Queue<Object> queue;
    private int maxSize;
    private String name;


    public Producer(Queue<Object> queue, int maxSize, String name){
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
    }


    @Override
    public void run() {
        while(true) {
            synchronized (queue){
                if (queue.size() < maxSize) {
                    queue.add(new Object());
                    System.out.println(this.name + ": Adding a shirt. " +
                            "New queue size: " + queue.size());
                }
            }
        }
    }
}
