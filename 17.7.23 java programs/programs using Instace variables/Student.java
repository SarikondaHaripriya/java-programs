class Student
  {
    int rollno;
    String name;
    public void insert(int r,String n)
    {
      rollno=r;
      name=n;
    }
    public void display()
    {
      System.out.println("the rollnumber of student is"+rollno);
      System.out.println("the name of the student is"+name);
    }
    public static void main(String args[])
    {
      Student s=new Student();
      s.insert(145,"priya");
      s.display();
      Student s1=new Student();
      s1.insert(183,"hari");
      s1.display();
    }
  }