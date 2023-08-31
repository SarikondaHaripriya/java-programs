/*Given an array of integers, write a Java program to convert it into a Set to remove duplicates.
Convert the Set back to an array and print the unique values.*/
import java.util.*;
class SetEx2
  {
    public static void main(String args[])
    {
      int a[]={1,2,2,4,4,5,6,7};
      Set<Integer> uniqueset=new HashSet<Integer>();
      for(Integer set:a)
        {
          uniqueset.add(set);
        }
      System.out.println(uniqueset);
      int uniquearray[]=new int[uniqueset.size()];
      int index=0;
      for(int num:uniqueset)
        {
          uniquearray[index++]=num;
        }
      System.out.println("the unique elements are");
      for(int num:uniquearray)
        {
          System.out.print(num+" ");
        }
      
    }
  }