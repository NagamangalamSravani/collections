import java.util.*;
class CopyOfArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar1[]={1,2,3,4,5};
        int ar2[]=new int[ar1.length];
        for(int i=0; i<ar1.length;i++)
        {
            ar2[i]=ar1[i];
        }

        //display array elements
        System.out.println("original array");
        for(int i=0; i<ar1.length;i++)
        {
            System.out.println(ar1[i]+ "");
        }

        //display  new array
        System.out.println("new array");
        for(int i=0; i<ar2.length;i++)
        {
            System.out.println(ar2[i]+ "");
        }

    }
}