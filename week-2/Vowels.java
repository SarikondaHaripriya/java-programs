import java.util.*;
class Vowels
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a variable");
      char ch=sc.next().charAt(0);
      if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
      {
        System.out.println("given variable is vowel");
      }
      else{
        System.out.println("given variable is consonant");
      }
    }
  }
