class Method
  {
    public void display()
    {
      System.out.println("this is method overloading");
    }
    public void display(String name)
    {
      System.out.println("name is "+name);
    }
    public void display(String name,int age)
    {
      System.out.println("name is "+name+" age is "+age);
    }
    public void display(int age,String address)
    {
      System.out.println("age is "+age+" address is "+address);
    }
  }
class Methodoverloading
  {
    public static void main(String args[])
    {
      Method mo=new Method();
      mo.display();
      mo.display("priya");
      mo.display("priya",23);
      mo.display(23,"vijayawada");
    }
  }