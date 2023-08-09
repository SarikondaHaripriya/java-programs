import java.util.*;
class Firstocc
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int pos=-1;
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the word for occurance");
      String word=sc.nextLine();
      String s[]=str.split(" ");
      for(int i=0;i<s.length;i++)
        {
          if(word.equals(s[i]))
          {
            pos=i;
            break;
          }
        }
      if(pos>=0)
      {
        System.out.println("the first occurance is at"+pos);
      }
      else{
        System.out.println("the word not found in the string");
      }
      
    }
  }