/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."*/
class Start_engine
  {
    public void start()
    {
      System.out.println("engine starting");
    }
  }
class Car extends Start_engine
  {
    public void start()
    {
      System.out.println("car engine starting");
    }
  }
class Motorcycle extends Start_engine
{
  public void start()
  {
    System.out.println("motor cycle engine started");
  }
}
class Engine
  {
    public static void main(String args[])
    {
      Start_engine s=new Start_engine();
      Start_engine car=new Car();
      Start_engine cycle=new Motorcycle();
      s.start();
      car.start();
      cycle.start();
    }
  }