import java.util.*;
class LeapYear
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a year");
      int year=sc.nextInt();
      if((year%4==0&&year%100!=0)||(year%400==0))
      {
        System.out.println(year +"year is leap year");
      }
      else
      {
      System.out.println(year+ "year is not leap year");  
      }
    }
  }