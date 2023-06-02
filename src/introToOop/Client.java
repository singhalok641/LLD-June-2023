package introToOop;

public class Client {
    public static void main(String[] args) {
        Student saloni = new Student();
        saloni.name = "Saloni";
        saloni.universityName = "Scaler Tech University";
        saloni.batchName = "LLD June 2023";
        saloni.psp = 73;

        System.out.println(saloni.name);

        Student manoj = new Student();
        System.out.println(manoj.name);

        manoj.giveMockInterview();
        saloni.changeBatch("LLD Sep 2023");
        System.out.println(saloni.batchName);
    }
}
