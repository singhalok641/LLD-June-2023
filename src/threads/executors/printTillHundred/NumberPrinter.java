package threads.executors.printTillHundred;

public class NumberPrinter implements Runnable{

    private int numberToPrint;

    public NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println("Printing number: " + numberToPrint
        + "Printed by thread: " + Thread.currentThread().getName());
    }
}
