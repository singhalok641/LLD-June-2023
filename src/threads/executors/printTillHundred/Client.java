package threads.executors.printTillHundred;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1;i<=100;i++){
            if(i == 5 || i == 11 || i == 20 || i == 50){
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        executorService.shutdown();
    }
}
