import java.util.*;
class LinkedListSetEx
  {
    public static void main(String args[])
    {
    LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
    ls.add(123);
    ls.add(145);
    ls.add(145);
      ls.add(null);
      ls.add(null);// accepts only one null value and fallows insertion order
    System.out.println(ls);
      ls.remove(123);//it takes the value for removal
      System.out.println(ls);
      ls.add(155);
      //ls.set(1,145); it doesnt consist set method
      System.out.println(ls);
    }    
  }