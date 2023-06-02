package accessModifiersCheck;

import accessModifiers.Student;

public class StudentChild extends Student {
    public void doSomething(){
        StudentChild st = new StudentChild();
        st.psp = 23;
    }
}