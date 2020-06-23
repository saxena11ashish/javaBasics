package collections.listInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUse {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add(1);
        Iterator t = list.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }
    }
}
