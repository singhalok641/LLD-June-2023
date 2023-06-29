package Synchronization.AdderSubtractorSynchronized;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Count count1 = new Count();

        Adder adder = new Adder(count, count1);
        Subtractor subtractor = new Subtractor(count, count1);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
        System.out.println(count1.value);

    }
}
