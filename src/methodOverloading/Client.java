package methodOverloading;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("a");
        a.doSomething("a", "b");
        a.doSomething("a", "b", "c");
    }
}
