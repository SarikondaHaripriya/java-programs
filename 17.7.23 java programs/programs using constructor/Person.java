//Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.
class Person
  {
    String name;
    int age;
    String address;
    Person(String n,int a,String s)
    {
      name=n;
      age=a;
      address=s;
    }
    public void display()
    {
      System.out.println("the name of the person is"+name);
      System.out.println("the age of the person is "+age);
      System.out.println("the address is "+address);
    }
    public static void main(String args[])
    {
      Person person=new Person("priya",23,"vijayawada");
      Person person1=new Person("raju",28,"eluru");
      person.display();
      person1.display();
    }
  }