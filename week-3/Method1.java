import java.util.*;
class Method1
  {
    public static void studentDetails(String name,int rno)
    {
      System.out.println("the student name is: "+name+"roll no is:  "+rno);
    }
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter student name");
      String sname=sc.nextLine();
      System.out.println("enter student number");
      int srno=sc.nextInt();
      studentDetails(sname,srno);
      studentDetails("Priya",107);      
    }
  }
