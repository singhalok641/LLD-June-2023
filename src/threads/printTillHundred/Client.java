package threads.printTillHundred;

public class Client {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; ++i) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
//            t.run();
        }
    }
}
