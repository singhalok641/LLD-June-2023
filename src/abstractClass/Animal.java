package abstractClass;

abstract public class Animal {
    String name;
    int age;
    abstract void walk();
    abstract void eat();
    abstract void sleep();
    void makeSound(){
        System.out.println("Animal is making sound");
    }
}
