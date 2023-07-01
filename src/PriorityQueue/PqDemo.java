package PriorityQueue;

import java.util.*;

import static PriorityQueue.PqDemo.Car.AComparatorName;
import static PriorityQueue.PqDemo.Car.AComparatorPower;

public class PqDemo {

    static class Car implements Comparable<Car>{
        int speed;
        int power;
        String name;

        @Override
        public String toString() {
            return "(" + this.name + "-" + this.speed + "-" + this.power + ")";
        }

        public Car(String name, int speed, int power){
            this.name = name;
            this.speed = speed;
            this.power = power;
        }

        @Override
        public int compareTo(Car o) {
            return this.speed - o.speed;
        }

        public static final CarPowerComparator AComparatorPower = new CarPowerComparator();
        public static final CarNameComparator AComparatorName = new CarNameComparator();

        static class CarPowerComparator implements Comparator<Car>{
            @Override
            public int compare(Car o1, Car o2) {
                return o1.power - o2.power;
            }
        }

        static class CarNameComparator implements Comparator<Car>{
            @Override
            public int compare(Car o1, Car o2) {
                return o1.name.compareTo(o2.name);
            }
        }
    }

    public static void demoCustomClassPqComparator2(){
        String name = "Alok";
        Comparator<Car> customComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.speed != o2.speed){
                    return o1.speed - o2.speed;
                }
                else{
                    return o1.power - o2.power;
                }
            }
        };

        PriorityQueue<Car> pq = new PriorityQueue<>(Collections.reverseOrder(customComparator));
        pq.add(new Car("supra", 100, 500));
        pq.add(new Car("alto", 80, 200));
        pq.add(new Car("wagonr", 80, 300));
        pq.add(new Car("bmw", 150, 700));
        pq.add(new Car("ferrari", 200, 1000));

        // Iterator is just iterating over the PQ and not maintaining any order as such
//        for(Car c: pq){
//            System.out.println(c);
//        }

        // Use proper methods to get items in the correct order
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }


    public static void demoCustomClassPqComparator(){
//        PriorityQueue<Car> pq = new PriorityQueue<>(
//                Collections.reverseOrder(new Car.CarPowerComparator()));

//        PriorityQueue<Car> pq = new PriorityQueue<>(AComparatorPower);
        PriorityQueue<Car> pq = new PriorityQueue<>(AComparatorName);
        pq.add(new Car("supra", 100, 500));
        pq.add(new Car("alto", 80, 200));
        pq.add(new Car("bmw", 150, 700));
        pq.add(new Car("ferrari", 200, 1000));

        // Iterator is just iterating over the PQ and not maintaining any order as such
//        for(Car c: pq){
//            System.out.println(c);
//        }

        // Use proper methods to get items in the correct order
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }

    public static void demoCustomClassPQ(){
        PriorityQueue<Car> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Car("SUPRA", 100, 500));
        pq.add(new Car("ALTO", 80, 200));
        pq.add(new Car("Bmw", 150, 700));
        pq.add(new Car("Ferrari", 200, 1000));

        for(Car c: pq){
            System.out.println(c);
        }

//        while(!pq.isEmpty()){
//            System.out.println(pq.remove());
//        }
    }

    public static void main(String[] args) {
//        setDemo();
//        linkedSetDemo();
//       demo1();
//        demoCustomClassPQ();
//        demoCustomClassPqComparator();
        demoCustomClassPqComparator2();
    }

    public static void setDemo(){
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("UK");
        set.add("USA");
        set.add("China");
        set.add("Japan");
        set.add("Netherlands");

        System.out.println(set);
    }

    public static void linkedSetDemo(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("India");
        set.add("UK");
        set.add("USA");
        set.add("China");
        set.add("Japan");
        set.add("Netherlands");

        System.out.println(set);
    }

    public static void demo1(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(3);
        pq.add(5);
        pq.add(9);
        pq.add(100);
        pq.add(2);

        System.out.println(pq);
    }
}
