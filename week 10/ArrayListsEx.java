import java.util.*;
class ArrayListsEx
  {
    public static void main(String args[])
    {
      ArrayList<String> a=new ArrayList<String>();
      a.add("mango");
      a.add("goa");
      a.add("banana");
      ArrayList<String> al=new ArrayList<String>();
      al.add("mango");
      al.add("apple");
      al.add("jackfruit");
      al.addAll(a);
      System.out.println(al);
      al.retainAll(a);
      System.out.println(al);
      /*al.removeAll(a);
      Iterator itr=al.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }*/
    }
  }