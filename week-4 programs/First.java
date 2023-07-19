import java.util.*;
class First
  {
    public static void first(String str,char ch)
    {
      int i;
      for( i=0;i<str.length();i++)
        {
          if(str.charAt(i)==ch)
          {
           break;
          }
        }
      System.out.println("the first occurance of the string is at index "+i);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the character for first occurance");
      char ch=sc.next().charAt(0);
      first(str,ch);
    }
  }