/*Create two sets: set1 and set2, and add some elements to each.
Find and print the union of the two sets.
Find and print the intersection of the two sets.
Find and print the elements that are unique to each set (i.e., not in the other set).*/
import java.util.*;
class SetEx3
  {
    public static void main(String args[])
    {
      Set<Integer> set1=new HashSet<Integer>();
      Set<Integer> set2=new HashSet<Integer>();
      set1.add(1);
      set1.add(2);
      set1.add(3);
      set1.add(4);
      set2.add(3);
      set2.add(4);
      set2.add(5);
      set2.add(6);
      set1.addAll(set2);
      System.out.println("the union of two sets is"+set1);
      set2.retainAll(set1);
      System.out.println("the intersection elements of sets are"+set1);
      set1.removeAll(set2);
      System.out.println("the unique values inthe set are"+set1);
      set2.removeAll(set1);
      System.out.println("the unique values in the set are"+set2);
    }
  }
