package copyConstructor;

public class Student {
    String name;
    int age;
    private String univName;

    // Default Constructor
    public Student(){

    }

    // Parameterised Constructor
    public Student(int age, String name, String univName){
        this.age = age;
        this.name = name;
        this.univName = univName;
    }

    // Copy Constructor
    public Student(Student oldStudent){
        System.out.println("Address in constructor: " + this);
        this.name = oldStudent.name;
        this.age = oldStudent.age;
        this.univName = oldStudent.univName;
    }
}
