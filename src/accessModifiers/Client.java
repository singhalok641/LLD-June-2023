package accessModifiers;


public class Client {
    public static void main(String[] args) {
        System.out.println(Student.university);
        Student student = new Student();
//        student.name = "Alok";
        student.batchId = 23;
        student.psp = 89;
    }
}
