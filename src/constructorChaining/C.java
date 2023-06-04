package constructorChaining;

public class C extends B{

    public C(){
        System.out.println("Constructor C");
    }

    public C(String name){
        System.out.println("Constructor C: " + name);
    }
}
