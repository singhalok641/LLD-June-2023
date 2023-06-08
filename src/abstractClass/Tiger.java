package abstractClass;

public class Tiger extends Animal{
        @Override
        void walk() {
            System.out.println("Tiger is walking");
        }

        @Override
        void eat() {
            System.out.println("Tiger is eating");
        }

        @Override
        void sleep() {
            System.out.println("Tiger is sleeping");
        }
}
