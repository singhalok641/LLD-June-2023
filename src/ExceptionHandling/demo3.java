package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("hello");
            System.out.println("shello");
            int val = in.nextInt();
            System.out.println("Bye");
            System.out.println("Shaye");

            if(val == 10) return;
        } catch (
                InputMismatchException inputMismatchException) {
            // log the exception
            inputMismatchException.printStackTrace();
            System.out.println("catch block: A bug has occured and it has been logged");
        }
        finally {
            System.out.println("Finally block: Closing scanner connection");
            in.close();
        }


//        System.out.println("for testing purpose");
//        in.close();

        System.out.println("Last: Your program has not crashed. It has exited gracefully");
    }
}
