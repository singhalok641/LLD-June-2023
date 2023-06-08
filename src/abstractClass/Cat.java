package abstractClass;

abstract public class Cat extends Animal{

    @Override
    void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
