package Polymorphism;

import java.util.Random;

public class Client {

    public static A doSomething(){
        Random random = new Random();
        int a = random.nextInt();

        if(a%2 == 0) {
            return new B();
        }
        else {
            return new C();
        }
    }

    public static void main(String[] args) {
        A a = new C();

        a.age = 21;
        a.name = "Naman";

//        a.companyName = "Google";
    }
}

/*
* User user = getUser();
* user.changePassword();
*
* */
