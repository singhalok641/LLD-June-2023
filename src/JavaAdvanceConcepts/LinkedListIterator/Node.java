package JavaAdvanceConcepts.LinkedListIterator;

import java.util.Iterator;

public class Node implements Iterable<Integer>{
    private int data;
    private Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator(this);
    }

    public static class LinkedListIterator implements Iterator<Integer>{
        private Node temp;

        LinkedListIterator(Node temp){
            this.temp = temp;
        }

        @Override
        public boolean hasNext() {
            //whether there is a next element
            if(temp == null) return false;
            else return true;
        }

        @Override
        public Integer next() {
            // return the next element
            Integer val = temp.data;
            temp = temp.next;
            return val;
        }
    }
}
