import java.util.*;
class Student
  {
    int id;
    String name;
    String address;
    Student(int id,String name,String address)
    {
      this.id=id;
      this.name=name;
      this.address=address;
    }
    public String toString()
    {
      return(id+" "+name+" "+address);
    }
  }
class StudentArrayList
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> s=new ArrayList<Student>();
      System.out.println("enter the number of student records you want to enter");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          System.out.println("enter  "+(i+1)+"student record");
          System.out.println("enter student id");
          int id=sc.nextInt();
          sc.nextLine();
          System.out.println("enter name");
          String name=sc.nextLine();
          System.out.println("enter address");
          String address=sc.nextLine();
          Student st=new Student(id,name,address); 
          s.add(st);
        }
      for(Student std:s)
        {
          System.out.println(std);
        }
    }
  }