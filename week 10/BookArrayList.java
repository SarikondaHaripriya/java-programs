import java.util.*;
class Book
  {
    int id;
    String title;
    String author;
    int year;
    float price;  
Book(int id,String title,String author,int year,float price)
  {
    this.id=id;
    this.title=title;
    this.author=author;
    this.year=year;
    this.price=price;
  }
    public String toString()
    {
      return(id+" "+title+" "+author+" "+year+" "+price);
    }
  }
class BookArrayList
  {
    public static void main(String args[])
    {
      Book b1=new Book(123,"java","jamesghostling",2003,270.32f);
      Book b2=new Book(145,"frost","crowford",2001,200.36f);
      Book b3=new Book(165,"c","david",2012,450.32f);
      Book b4=new Book(183,"cn","andrew",1987,290.30f);
      Book b5=new Book(197,"se","mall rajib",2002,650.85f);
      ArrayList<Book> b=new ArrayList<Book>();
      b.add(b1);
      b.add(b2);
      b.add(b3);
      b.add(b4);
      b.add(b5);
      for(Book book:b)
        {
          System.out.println(book);
        }
      
    }
  }