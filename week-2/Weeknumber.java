import java.util.*;
class Weeknumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number ");
      int w=sc.nextInt();
      if(w==0)
      {
        System.out.println("Sunday");
      }
      else if(w==1)
      {
        System.out.println("Monday");
      }
      else if(w==2)
      {
        System.out.println("tuesday");
      }
      else if(w==3)
      {
        System.out.println("Wednesday");
      }
      else if(w==4)
      {
        System.out.println("Thursday");
      }
      else if(w==5)
      {
        System.out.println("Friday");
      }
      else if(w==6)
      {
        System.out.println("Saturday");
      }
      else{
        System.out.println("invalid number");
      }
    }
  }