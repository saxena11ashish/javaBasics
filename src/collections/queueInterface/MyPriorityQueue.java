package collections.queueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        Iterator<String > itr2 = queue.iterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());

        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());

        System.out.println(queue.size());
        queue.remove();
        queue.poll();

        Iterator<String > itr = queue.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());



    }
}
