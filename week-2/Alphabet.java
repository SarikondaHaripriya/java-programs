import java.util.*;
class Alphabet
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      char ch=sc.next().charAt(0);
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
        System.out.println("given value is alphabet");
        }
     else
      {
        System.out.println("given value is not alphabet");
      }
    }
  }