package threads.HelloWorldPrinter;

public class Client {

//    public static void doSomething() {
//        System.out.println("doSomething() called by thread: " +
//                Thread.currentThread().getName());
//    }
    public static void main(String[] args) {
        System.out.println("Hello World. Printed by thread: " +
                Thread.currentThread().getName());

//        doSomething();
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        // Write code to print numbers from 1 to 100

        int a=0;
        for(int i=1;i<=1000000;i++){
            a++;
        }

        System.out.println("Before I end. Printed by thread: " +
                Thread.currentThread().getName());
    }
}
