import java.util.*;
class LastOccurance
  {
    public static void last(String str,char ch)
    {
      int i;
      for(i=0;i<str.length();i++)        
        {
          if(str.charAt(0)==ch)
          {
            
          }
          }
      System.out.println("the last occurance of a string is"+i);
          
        }
    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the charcter for finding the last accurance");
      char ch=sc.next().charAt(0);
      last(str,ch);
      
    }
  }

