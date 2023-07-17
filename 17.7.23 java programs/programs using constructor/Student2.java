//Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.
class Student2
  {
    String name;
    int rollno;
    char grade;
    Student2(String n,int r,char g)
    {
      name=n;
      rollno=r;
      grade=g;
    }
    public void display()
    {
      System.out.println("the name of the student is "+name);
      System.out.println("the rollnumber is "+rollno);
      System.out.println("grade is "+grade);
    }
    public static void main(String args[])
    {
      Student2 student=new Student2("priya",107,'a');
      Student2 student1=new Student2("jayasri",103,'a');
      Student2 student2=new Student2("prashanthi",73,'a');
      student.display();
      student1.display();
      student2.display();
      
    }
  }