import java.util.*;
public class LinkedHashSetDemo
{
    public static void main(String args[])
    {
        LinkedHashSet<String> lhs= new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        System.out.println(lhs);
    }
}
