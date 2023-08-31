import java.util.*;
class CollectionMethods
  {
    public static void main(String args[])
    {
      ArrayList<String> list=new ArrayList<String>();
      list.add("priya");
      list.add("prashanthi");
      list.add("jayasri");
      System.out.println(list);
      list.add(2,"jeevani");
      System.out.println(list);
      Collections.sort(list);
       System.out.println(list);
      list.remove("jeevani");
      for(String str:list)
        {
          System.out.println(str);
        }
      System.out.println("the size of the array list is "+list.size());
    }
  }