//initialising with the instance variable and creating array od objects
import java.util.*;
class StudentObject
  {
    String name;
    int rollno;
    String address;
    public void display()
    {
      System.out.println("the student details are");      System.out.println("name:"+name+"rollno:"+rollno+"address:"+address);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      StudentObject student[]=new StudentObject[3];
      for(int i=0;i<student.length;i++)
        {
          student[i]=new StudentObject();
          System.out.println("enter student "+(i+1)+"details");
          System.out.println("enter student name");
          student[i].name=sc.next();
          System.out.println("enter rollno");
          student[i].rollno=sc.nextInt();
          System.out.println("enter address");
          student[i].address=sc.next();
        }
      for(int i=0;i<student.length;i++)
        {
          student[i].display();
        }
    }
  }