//Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.
class Car1
  {
    String make;
    String model;
    int year;
    public void setCarDetails(String n,String m,int y)
    {
      make=n;
      model=m;
      year=y;
    }
    public void display()
    {
      System.out.println("the make of the car is"+make);
      System.out.println("the model of the car is"+model);
      System.out.println("the year of the car"+year);
    }
    public static void main(String args[])
    {
      Car1 c=new Car1();
      c.setCarDetails("maruthi","suzuki",2000);
      c.display();
      Car1 c1=new Car1();
      c1.setCarDetails("audi","xyzzca",1999);
      c1.display();
    }
  }