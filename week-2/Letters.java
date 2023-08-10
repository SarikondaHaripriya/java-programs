import java.util.*;
class Letters
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a variable");
      char ch=sc.next().charAt(0);
      if(ch>='A'&&ch<='Z')
      {
        System.out.println("given letter is a uppercase letter");
      }
      else{
        System.out.println("given letter is lowercaseletter");
      }
    }
  }