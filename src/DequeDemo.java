import java.util.*;
public class DequeDemo
{
    public static void main(String args[])
    {
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        /*dq.addLast(10);// dq.offerLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);*/


        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);

        dq.addLast(10);// dq.offerLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        System.out.println(dq);
    }
}
