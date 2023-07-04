package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("shello");

//        File file = new File("abc.txt");
//        FileReader fr = new FileReader(file);
//        fr.read();

        Scanner in = new Scanner(System.in);
        int val = in.nextInt();

        System.out.println("Bye");
        System.out.println("Shaye");
    }
}
