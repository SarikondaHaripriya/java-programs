//Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.
import java.util.*;
class Person1
  {
    String name;
    int age;
    String address;
    Person1(String n,int m,String a)
    {
      name=n;
      age=m;
      address=a;
    }
    public void display()
    {
      System.out.println(name+" "+age+" "+address);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Person1 p[]=new Person1[5];
      for(int i=0;i<p.length;i++)
        {
          System.out.println("enter person"+(i+1)+"details");
          System.out.println("enter the name");
          String n=sc.next();
          System.out.println("enter the age of the person");
          int m=sc.nextInt();
          System.out.println("enter the address of the person");
          String a=sc.next();
          p[i]=new Person1(n,m,a);
          
        }
      for(int i=0;i<p.length;i++)
        {
          p[i].display();
        }
    }
  }