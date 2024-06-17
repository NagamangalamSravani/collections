import java.util.*;
public class PriorityQueueDemo
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> p= new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
     // System.out.println(p.poll());// least no. i.e., 3 will  be deleted from total elements
       System.out.println(p.peek()); // top most element will be displayed along with total elements
        System.out.println(p);
    }
}
