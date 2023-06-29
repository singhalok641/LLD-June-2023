package Synchronization.AdderSubtractorSynchronized;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    private Count count;
    private Count count1;

    public Subtractor(Count count, Count count1){
        this.count1 = count1;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000000;i++){
            count1.value -= i;
            synchronized (count) {
                count.value -= i;
            }
        }
    }
}
