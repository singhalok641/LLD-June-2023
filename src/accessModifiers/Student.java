package accessModifiers;

public class Student {
    public static String university = "Scaler";
    private String name;
    int batchId; //default
    protected double psp;

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Alok";
        System.out.println(st.name);
    }


}
