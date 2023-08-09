import java.util.Scanner;
class Lengthstr
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      int longlen=s[0].length();
      String word="";
      for(int i=0;i<s.length;i++)
        {
          if(longlen<s[i].length())
          {
            longlen=s[i].length();
            word=s[i];
          }
        }
      System.out.println("the high length word in the string is "+word);
      
    }
  }