import java.util.*;
class Grade
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter Computer marks:");
      int Computer=sc.nextInt();
      System.out.println("enter English marks:");
      int English=sc.nextInt();
      System.out.println("enter CN marks:");
      int CN=sc.nextInt();
      System.out.println("enter SE marks:");
      int SE=sc.nextInt();
      System.out.println("enter AI marks:");
      int AI=sc.nextInt();
      float Total=(Computer+English+CN+SE+AI);
      float Percentage=((Total/500)*100);
      if(Percentage>=90&&Percentage<=100)
      {
        System.out.println("A grade");
      }
      else if(Percentage>=70&&Percentage<=89)
      {
        System.out.println("B grade");
      }
      else if(Percentage>=60&&Percentage<=69)
      {
        System.out.println("C grade");
      }
      else if(Percentage>=50&&Percentage<=59)
      {
        System.out.println("D grade");
      }
      else if(Percentage>=40&&Percentage<=49)
      {
        System.out.println("E grade");
      }
      else{
        System.out.println("Fail");
      }
    }
  }