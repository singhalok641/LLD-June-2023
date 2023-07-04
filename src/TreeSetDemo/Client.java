package TreeSetDemo;

import java.util.TreeSet;

public class Client {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(60);
        ts.add(70);

        // Log(N)
        System.out.println(ts.ceiling(35));
        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(35));

        System.out.println(ts.first());
        System.out.println(ts.last());

        // O(N)
        System.out.println(ts.headSet(30));
        System.out.println(ts.headSet(30, true));

        System.out.println(ts.tailSet(35));
        System.out.println(ts.tailSet(40, true));

        System.out.println(ts.subSet(30,70));
        System.out.println(ts.subSet(30,true,70,true));
        System.out.println(ts.subSet(30,false,70,true));



    }
}
