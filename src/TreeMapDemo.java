import java.util.*;
public class TreeMapDemo
{
    public static void main(String args[])
    {
        TreeMap<Integer, String> tm= new TreeMap<>();
        tm.put(1, "A");
        tm.put(2,"B");
        tm.put(3, "C");
        tm.put(4,"D");
        tm.put(5, "E");

       // System.out.println(tm.get(5));
        System.out.println(tm);
    }
}
