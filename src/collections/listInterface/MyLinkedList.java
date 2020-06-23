package collections.listInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(21);
        l.add(2);
        l.add(20);
        Iterator itr = l.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
