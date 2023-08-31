import java.util.*;
class CollectionEx
  {
    public static void main(String args[])
    {
      ArrayList<String> list=new ArrayList<String>();
      list.add("Hari");
      list.add("priya");
      list.add("sarikonda");
      System.out.println(list);
      Iterator itr=list.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      for(String str:list)
        {
          System.out.println(str);
        }
    }
  }