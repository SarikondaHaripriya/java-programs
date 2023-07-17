//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.
class Employee2
  {
    String name;
    String designation;
    int salary;
    Employee2(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    public void display()
    {
      System.out.println("the name of the employee "+name);
      System.out.println("the designation of the employee "+designation);
      System.out.println("salary is "+salary);
    }
    public static void main(String args[])
    {
     Employee2 employee=new Employee2("priya","hr",75000);
      Employee2 employee1=new Employee2("raju","manager",70000);
      Employee2 employee2=new Employee2("jayasri","asst.manager",70000);
      employee.display();
      employee1.display();
      employee2.display();
      
    }
    
    
  }