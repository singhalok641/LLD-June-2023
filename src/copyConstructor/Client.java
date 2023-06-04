package copyConstructor;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student(25, "Alok", "Scaler");
        Student st2 = new Student(st1);
        System.out.println("Address in Client:" + st2);
//
//        Student st2 = st1;
//
//        System.out.println(st1.name + " " + st2.name);
        System.out.println("DEBUG");
    }
}