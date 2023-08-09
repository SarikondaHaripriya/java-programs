import java.util.*;
class PalindromeLengthmethod
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a String");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      String word="";
      int len=s[0].length();
      for(int i=0;i<s.length;i++)
        {
          String temp=s[i];
          String rev="";
          for(int j=temp.length()-1;j>=0;j--)
            {
              rev=rev+temp.charAt(i);
            }
        }
    }
  }