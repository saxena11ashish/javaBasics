package collections.listInterface;

import java.util.List;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack <Integer> l = new Stack<>();
        l.push(2);
        l.push(21);
        System.out.println(l.peek());
        l.pop();
        System.out.println(l.size());
    }
}
