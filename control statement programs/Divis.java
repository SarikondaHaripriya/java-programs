import java.util.*;
class Divis
  {
    public static void main(String args[])
    {
      System.out.println("the numbers divisible by 3 and 5 are");
      for(int i=1;i<=100;i++)
        {
          if(i%3==0&&i%5==0)
          {
            System.out.print(i+",");
          }
        }
      System.out.println("\n the numbers divisible by 5 are");
      for(int i=1;i<=100;i++)
        {
          if(i%5==0)
          {
            System.out.print(i+",");
          }
        }
      System.out.println("\n the numbers divisible by 3 are");
      for(int i=1;i<=100;i++)
        {
          if(i%3==0)
          {
            System.out.print(i+",");
          }
        }
    }
  }