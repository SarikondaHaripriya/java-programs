/*Create a class called Person with attributes such as name and age.
Create a HashSet of Person objects and add several Person objects to it.
Check if the set contains a specific Person based on their attributes (e.g., name and age).*/
import java.util.*;
class Person
  {
    String name;
    int age;
    Person(String name,int age)
    {
      this.name=name;
      this.age=age;
    }
    public String toString()
    {
      return(name+" "+age);
    }
  }
class SetEx4
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of persons record you want to insert");
      int n=sc.nextInt();
      HashSet<Person> person=new HashSet<Person>();
      for(int i=0;i<n;i++)
        {
          System.out.println("enter "+(i+1)+"person record");
          System.out.println("enter name of the person");
          String name=sc.next();
          System.out.println("enter age");
          int age=sc.nextInt();
          Person p=new Person(name,age);
          person.add(p);
        }
      for(Person per:person)
        {
          System.out.println(per);
        }
      //System.out.println("the person details contains inthe set"+person.contains(23));
      
    }
  }
