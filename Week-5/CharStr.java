import java.util.*;
class CharStr
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      int charcount=0,intcount=0,splcount=0;
      for(int i=0;i<str.length();i++)
        {
      if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
      {
        charcount=charcount+1;
      }
      else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
      {
        intcount=intcount+1;
      }
      else{
        splcount=splcount+1;
      }
        }
      System.out.println("the alphabets in the string are"+charcount);
      System.out.println("the integer count in the string is"+intcount);
      System.out.println("the special character count in the string is"+splcount);
         

    }
  }