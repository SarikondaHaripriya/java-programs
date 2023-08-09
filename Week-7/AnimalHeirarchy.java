/*Create an abstract class called "Animal" with the following abstract methods:

speak(): Outputs the sound that the animal makes.
move(): Describes how the animal moves.

Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.

Write a program to:

Create instances of Dog, Cat, and Bird.
Display the sound and movement of each animal.*/
abstract class Animal
  {
    public void display()
    {
      System.out.println("the sounds and moves made by the animals");
    }
    abstract void speak();
    abstract void move();
  }
class Dog extends Animal
  {
    public void speak()
    {
      System.out.println("the dog sounds bow bow");
    }
    public void move()
    {
      System.out.println("the dog is walking");
    }
  }
class Cat extends Animal
{
  public void speak()
  {
    System.out.println("the cat sounds as meow meow");
  }
  public void move()
  {
    System.out.println("the cat is running");
  }
}
class Bird extends Animal
  {
    public void speak()
    {
      System.out.println("the birds whispers");
    }
    public void move()
    {
      System.out.println("the bird is flying");
    }
  }
class AnimalHeirarchy
  {
    public static void main(String args[])
    {
      Animal a=new Dog();
      Animal b=new Bird();
      Animal c=new Cat();
      a.speak();
      a.move();
      b.speak();
      b.move();
      c.speak();
      c.move();
    }
  }
