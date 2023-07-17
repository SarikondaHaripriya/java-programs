//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.
class Employee1
  {
    String ename;
    String designation;
    int salary;
    public void set(String n,String d,int s)
    {
      ename=n;
      designation=d;
      salary=s;
    }
    public void display()
    {
      System.out.println("the name of the employee is "+ename);
      System.out.println("the designation of the employee  "+designation);
      System.out.println("the salary of the employee is "+salary);
    }
    public static void main(String args[])
    {
      Employee1 e=new Employee1();
      Employee1 e1=new Employee1();
      Employee1 e2=new Employee1();
      e.set("priya","hr",75000);
      e1.set("nandu","manager",70000);
      e2.set("sri","mentor",70000);
      e.display();
      e1.display();
      e2.display();
    }
  }