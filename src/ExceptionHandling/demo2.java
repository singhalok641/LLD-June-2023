package ExceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {

        try {
            System.out.println("hello");
            System.out.println("shello");

            Scanner in = new Scanner(System.in);
            int val = in.nextInt();

            System.out.println("Bye");
            System.out.println("Shaye");
        } catch (InputMismatchException inputMismatchException) {
            // log the exception
            inputMismatchException.printStackTrace();
            System.out.println("A bug has occured and it has been logged");
        }

        System.out.println("Your program has not crashed. It has exited gracefully");
    }
}
