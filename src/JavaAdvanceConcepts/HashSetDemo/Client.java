package JavaAdvanceConcepts.HashSetDemo;

import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        HashSet<Point> set = new HashSet<>();
        set.add(new Point(1,2));
        set.add(new Point(3,4));
        set.add(new Point(5,6));
        set.add(new Point(1,2));
        set.add(new Point(2,1));

        System.out.println(set.size());
    }
}
