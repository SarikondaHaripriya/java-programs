class Student
  {
    private String name;
    private int rollno;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
    public void setRollno(int rollno)
    {
      this.rollno=rollno;
    }
    public int getRollno()
    {
      return rollno;
    }
  }
class DataEncap
  {
    public static void main(String args[])
    {
      Student s=new Student();
      s.setName("priya");
      s.setRollno(107);
      System.out.println(s.getName());
      System.out.println(s.getRollno());
    }
  }