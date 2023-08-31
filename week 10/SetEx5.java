/*Create a HashSet of country names.
Use an iterator to loop through the set and print each country name.
Modify the loop to print the countries in reverse order.*/
import java.util.*;
import java.util.Iterator;
class SetEx5
  {
    public static void main(String args[])
    {
      Set<String> countries=new HashSet<String>();
      countries.add("india");
      countries.add("us");
      countries.add("uk");
      countries.add("korea");
      Iterator<String> itr=countries.iterator();
      System.out.println("the values in original order");
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      System.out.println("the reverse countries names are");
      Collections.reverse(countries);
      System.out.println(countries);
     /* Iterator<String> reverse=countries.descendingSet();
      while(reverse.hasNext())
        {
          System.out.println(reverse.next());
        }*/
    }
  }