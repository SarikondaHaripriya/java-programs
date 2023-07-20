class Animal
  {
    public void sound()
    {
      System.out.println("the sounds made by the animals are");
    }
  }
class Dog extends Animal
  {
    public void sound()
    {
      System.out.println("the dog sounds like bow bow");
    }
  }
class Cat extends Animal
{
  public void sound()
  {
    System.out.println("the cat says meow meow");
  }
}
class Methodoverriding
  {
    public static void main(String args[])
    {
      Animal animal=new Animal();
      animal.sound();
      Animal dog=new Dog();
      dog.sound();
      Animal cat=new Cat();
      cat.sound();
    }
  }