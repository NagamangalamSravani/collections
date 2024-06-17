import java.util.*;
public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2= new ArrayList<>(List.of(50,60,70,80,90));
        al1.add(10);
        al1.add(0,5);
        al1.addAll(al2);
        System.out.println(al1);
        System.out.println(al1.get(5));
        System.out.println(al1.contains(50));
       // System.out.println(al2);

    }
}

