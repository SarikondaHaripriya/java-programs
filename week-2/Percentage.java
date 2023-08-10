import java.util.*;
class Percentage
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the obtained marks ");
      float obtained=sc.nextFloat();
      float total=600f,percentage;
      percentage=((obtained/total)*100);
      System.out.println("the percentage obtained is "+percentage);
      
    }
  }