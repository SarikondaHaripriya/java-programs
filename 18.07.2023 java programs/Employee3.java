import java.util.*;
class Employee3
  {
    String name;
    String designation;
    int salary;
    Employee3(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    //System.out.println("the employee list is");
    public void display()
      {
      System.out.println(name+" "+designation+" "+salary);
      }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number you want to create the list");
      int count=sc.nextInt();
      Employee3 e[]=new Employee3[count];
      for(int i=0;i<e.length;i++)
        {
          System.out.println("enter "+(i+1)+"employee details");
          System.out.println("enter employee name");
          String n=sc.next();
          System.out.println("enter designation");
          String d=sc.next();
          System.out.println("enter the salary");
          int s=sc.nextInt();
          e[i]=new Employee3(n,d,s);
        }
      for(int i=0;i<e.length;i++)
        {
          e[i].display();
        }
    }
  }