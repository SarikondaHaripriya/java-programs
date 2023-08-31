import java.util.*;
class HashSetEx
  {
    public static void main(String args[])
    {
      HashSet<String> h=new HashSet<String>();
      h.add("priya");
      h.add("raju");
      h.add("sarikonda");
      System.out.println(h);
      h.add("sarikonda");//it doesnot gives the duplicate element two times it is displaying only one time and it is not fallowing any insertion order
      h.remove("sarikonda");//by removing the element the duplicate value is reomved 
      for(String hs:h)
        {
          System.out.println(hs);
        }
    }
  }