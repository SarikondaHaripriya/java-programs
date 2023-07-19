import java.util.*;
class FirstOccurance
  {
    public static void first(String str,char ch)
    {
          int s2=str.indexOf(ch);
          System.out.println("the alphabet first occurance is at index"+s2);
        
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the alphabet for value");
      char ch=sc.next().charAt(0);
      first(str,ch);
      
      
    }
  }