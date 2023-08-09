import java.util.*;
class InvalidAgeException extends Exception
  {
    InvalidAgeException(String message)
    {
      super(message);
    }
  }
class AgeValidator
  {
    public static void validateAge(int age)throws InvalidAgeException
    {
      if(age<18)
      {
       throw new InvalidAgeException("not eligible");
      }
      else
      {
        System.out.println("eligible");
      }
    }
    
  }
class Exceptionex
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int age=sc.nextInt();
      try{
        AgeValidator.validateAge(age);
      }
      catch(InvalidAgeException e)
        {
        e.printStackTrace();
      }
      System.out.println("exception handeled");
    }
  }