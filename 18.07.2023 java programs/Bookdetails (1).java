//printing book details using methods and array of objects
import java.util.*;
class Bookdetails
  {
    int id;
    String name;
    String author;
    int year;
    public void set(int i,String n,String a,int y)
    {
      id=i;
      name=n;
      author=a;
      year=y;
    }
    public void display()
    {
      System.out.println("id is: "+id);
      System.out.println("bookname is: "+name);
      System.out.println("author name: "+author);
      System.out.println("published year: "+year);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bookdetails b[]=new Bookdetails[3];      
      for(int i=0;i<b.length;i++)
        {
          b[i]=new Bookdetails();
      System.out.println("book"+(i+1)+"details");
      System.out.println("enter book id");
      int bid=sc.nextInt();
      System.out.println("enter book name ");
      String bname=sc.next();
      System.out.println("enter author name");
      String aname=sc.next();
      System.out.println("enter year");
      int ye=sc.nextInt();
      b[i].set(bid,bname,aname,ye);
        }
      for(int i=0;i<b.length;i++)
        {
          b[i].display();
        }
    }
      
  }