import java.util.*;
class TreeSetEx
  {
    public static void main(String args[])
    {
      TreeSet<String> t=new TreeSet<String>();
      t.add("mango");
      t.add("goa");
      t.add("banana");
      System.out.println(t);//treeset is fallowing sorting order
      t.remove("goa");//it takes the values for removal
      System.out.println(t);
      t.add("mango");//it is not displaying the duplicate values two times
      //t.add(null);
      //t.add(null);//it does not allow null values
      System.out.println(t);
      System.out.println(t.contains("banana"));
      System.out.println(t.size());
    }
  }