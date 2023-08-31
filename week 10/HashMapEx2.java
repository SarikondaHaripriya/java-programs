import java.util.*;
class Book
  {
    int id;
    String title;
    double price;
    Book(int id,String title,double price)
    {
      this.id=id;
      this.title=title;
      this.price=price;
    }
    public String toString()
    {
      return(id+" "+title+" "+" "+price);
    }
  }
class HashMapEx2
  {
    public static void main(String args[])
    {
      HashMap<Integer,Book> hash=new HashMap<Integer,Book>();
      Book book=new Book(123,"java",285.20);
      Book book1=new Book(145,"cn",256.20);
      hash.put(1,book);
      hash.put(2,book1);
      for(Map.Entry entry:hash.entrySet())
        {
          System.out.println("the key value is "+(entry.getKey()));
          System.out.println("the value is "+entry.getValue());
        }
      
    }
  }