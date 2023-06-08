package methodOverriding;

import Polymorphism.C;

import java.util.Random;

public class Client {

    public static A doSomething(){
        Random random = new Random();
        int a = random.nextInt();

        if(a%2 == 0) {
            return new A();
        }
        else {
            return new B();
        }
    }
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.doSomething("b");
        a.doSomething("a");
    }

    public void main(){
        System.out.println("Hello");
    }

    public String main(String name){
        return name;
    }
}
