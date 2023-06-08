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

/*
*
*
* Cat c = new Animal();
*
* c.meow(); -> Wrong
*
*
*  c = new Cat();
* a.meow() -> Wrong
*
*
*
* User u = getUser();
*
* u.login();
*
*
* Student st = new Student();
* TA ta = new TA();
* */
