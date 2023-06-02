package accessModifiers;

public class Student {
    private String name;
    int batchId; //default
    protected double psp;
    public String universityName;

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Alok";
        System.out.println(st.name);
    }


}
