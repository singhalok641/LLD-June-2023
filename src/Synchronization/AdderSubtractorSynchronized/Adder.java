package Synchronization.AdderSubtractorSynchronized;


import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Count count;
    private Count count1;
    public Adder(Count count, Count count1){
        this.count1 = count1;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000000;i++){
            synchronized (count) {
                count1.value += i;
                count.value += i;
            }
        }
    }
}
