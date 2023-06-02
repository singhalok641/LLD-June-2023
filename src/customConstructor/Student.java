package customConstructor;

class Student {
    String name;
    String batchName;
    double psp;
    String universityName;
    int age;

    // Replicating the behavior of default but this is a custom constructor
    public Student(String stName, int stAge){
        System.out.print("age:" + age);
        name = stName;
        age = stAge;
        universityName = "Scaler";
        batchName = "xyz";
    }

    public Student(String stName, int stAge, String universityName){
        System.out.print(age);
        name = stName;
        age = stAge;
        this.universityName = universityName;
    }
}
