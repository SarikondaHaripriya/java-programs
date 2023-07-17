/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that initializes these variables and display the employee's details.*/
class Employee
  {
    String designation;
    String ename;
    int esal;
    public void emp()
    {
      System.out.println("the designation of the employee is "+designation);
      System.out.println("the employee name is "+ename);
      System.out.println("the employee salary is "+esal);
    }
    public static void main(String args[])
    {
      Employee e=new Employee();
      Employee e1=new Employee();
      Employee e2=new Employee();
      e.designation="hr manager";
      e.ename="priya";
      e.esal=75000;
      e1.designation="Asst.manager";
      e1.ename="jaya";
      e1.esal=60000;
      e2.designation="mentor";
      e2.ename="john";
      e2.esal=55000;
      e.emp();
      e1.emp();
      e2.emp();
      
    }
  }