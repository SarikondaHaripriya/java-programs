/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a constructor that initializes these variables and display the car's details.*/
class Car
  {
    String model;
    int year;
    public void car()
    {
      System.out.println("the model of the car is"+model);
      System.out.println("the year of the are is"+year);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Car c=new Car();
    }
  }