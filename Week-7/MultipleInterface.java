interface Person
  {
    public void insert(int id,String name);
    public void display();
    public void print();
  }
interface Student
  {
    public void insert(int id,String name);
    public void print();
  }
class Details implements Person,Student
  {
    int id;
    String name;
    public void insert(int id,String name)
    {
      this.id=id;
      this.name=name;
    }
    public void display()
    {
      System.out.println("the details are");
    }
    public void print()
    {
      System.out.println(id+" "+name);
    }
  }
class MultipleInterface
  {
    public static void main(String args[])
    {
      Person p=new Details();
      p.insert(123,"priya");
      p.display();
      p.print();
      Student s=new Details();
      s.insert(145,"jaya");
      s.print();
    }
  }