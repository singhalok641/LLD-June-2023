package threads.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable {
    public void run() {
        System.out.println("Hello World! In a different Thread. Printed by thread: " +
                Thread.currentThread().getName());
    }
}
