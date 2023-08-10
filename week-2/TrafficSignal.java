import java.util.*;
class TrafficSignal
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 'AM' or 'PM'");
      String t=sc.nextLine();
      System.out.println("enter the time ");
      int time=sc.nextInt();
      if(t=="am"||t=="AM")
      {
        if (time>=7&&time<11)
      {
        System.out.println("heavy traffic");
        System.out.println("provides red signal");
      }
      else if(time==11&&time<=12)
      {
        System.out.println("minimum traffic");
        System.out.println("provides orange signal");          
      }
        else
      {
          System.out.println("provides green signal");
        }
      }
        else
      {
        if(time>=6&&time>8)
        {
          System.out.println("heavy traffic");
          System.out.println("provides red signal");
        }
          else if(time==8&&time>=11)
        {
          System.out.println("minimum traffic");
          System.out.println("provides orange signal");          
        }
          else
          {
            System.out.println("provide orange signal");
          }
        }
      }
  }