//printing the book details using instance variables and creating array of objects
import java.util.*;
class BookDetails
  {
    int id;
    String name;
    String author;
    int year;
    public void display()
    {
      System.out.println("book id is "+id);
      System.out.println("bookname "+name);
      System.out.println("authorname "+author);
      System.out.println("published year "+year);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      BookDetails b[]=new BookDetails[3];
      for(int i=0;i<b.length;i++)
        {
          b[i]=new BookDetails();
          System.out.println("the "+(i+1)+"book details are");
          System.out.println("enter the book id");
          b[i].id=sc.nextInt();
          System.out.println("enter the book name");
          b[i].name=sc.next();
          System.out.println("enter the author name");
          b[i].author=sc.next();
          System.out.println("enter the published year");
          b[i].year=sc.nextInt();          
        }
      for(int i=0;i<b.length;i++)
        {
          b[i].display();
        }
      
    }
  }