/*Create a Java program that manages an array of Employee objects. Each Employee object should have the following attributes:
employeeId: A unique 4-digit identifier for the employee.
employeeName: The name of the employee (between 3 and 40 characters).
mobileNumber: The employee's mobile number, a 10-digit string that starts with 9, 8, 7, or 6.
salary: The employee's salary, a positive integer not exceeding 1,000,000.
The program should allow the user to input data for each employee dynamically with the following validations:
employeeId: Ensure it's a unique 4-digit identifier.
employeeName: Validate that it contains only letters and is between 3 and 40 characters.
mobileNumber: Confirm that it's a 10-digit number starting with 9, 8, 7, or 6.
salary: Validate that it's a positive integer and doesn't exceed 1,000,000.
After collecting the data for five employees, display the details for all five employees.
Your program should implement these requirements and ensure that the data collected is accurate and follows the provided validation rules.*/
import java.util.*;
class Employee
  {
    int empid;
    String ename;
    String mobile;
    long sal;
    public void employee(int empid,String ename,String mobile,long sal)
    {
      this.empid=empid;
      this.ename=ename;
      this.mobile=mobile;
      this.sal=sal;
    }
    public void validateEmpid(int empid)
    {
      
    }
    public void validateEname(String ename)
    {
      if((ename.length() >=3)&&(ename.length() <=40))
        {
        System.out.println("valid name");
        }
      else{
        System.out.println("invalid name");
      }
    }
    public void validateMobile(String mobile)
    {
      if((mobile.length()==10)&&(mobile.startsWith("9")||mobile.startsWith("8")||mobile.startsWith("7")||mobile.startsWith("6")))
         {
        System.out.println("valid mobile number");
         }
      else{
        System.out.println("invalid mobile number");
      }
    }
    public void validateSalary(long sal)
    {
      if((sal>0)&&(sal<=1000000))
        {
        System.out.println("valid salary");
        }
      else{
        System.out.println("invalid salary");
      }
    }
    public void display()
    {
      //System.out.println("the eid is "+eid);
      System.out.println("the name of the employee is "+ename);
      System.out.println("the mobile number is "+mobile);
      System.out.println("the salaary is "+sal);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the employee record size");
      int n=sc.nextInt();
      Employee emp[]=new Employee[n];
      for(int i=0;i<n;i++)
        {
          emp[i]=new Employee();
          System.out.println("enter "+(i+1)+"employee details");
          System.out.println("enter employee id");
          int eid=sc.nextInt();
          System.out.println("enter employee name");
          String ename=sc.next();
          emp[i].validateName(emp[i].ename);
          System.out.println("enter employee mobile number");
          String mobile=sc.next();
          emp[i].validateMobile(emp[i].mobile);
          System.out.println("enter salary");
          long sal=sc.nextLong();
          emp[i].validateSalary(emp[i].sal);
        }
      for(int i=0;i<n;i++)
        {
          emp[i].display();
        }
    }
    
    }
  