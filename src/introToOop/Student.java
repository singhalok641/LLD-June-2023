package introToOop;

public class Student {
    String name;
    String batchName;
    double psp;
    String universityName;

    void changeBatch(String newBatch){
        batchName = newBatch;
    }
    void giveMockInterview(){
        System.out.println("Giving Mock Interview");
    }
}
