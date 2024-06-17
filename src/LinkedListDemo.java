import java.util.*;
public class LinkedListDemo {
    public static void main(String args[])
    {
        LinkedList<Integer> ll1= new LinkedList<>();
        LinkedList<Integer> ll2= new LinkedList<>(List.of(50,60,70,80,90));
        ll1.add(10);
        ll1.add(0,5);
        ll1.addAll(ll2);

        System.out.println(ll1.get(5));
        System.out.println(ll1.contains(50));
        // System.out.println(al2);
        ll1.addFirst(2);
        ll1.addLast(200);
        System.out.println(ll1);

    }
}
