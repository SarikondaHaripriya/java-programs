import java.util.*;
class Replacestr
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str="bit(labs)";
      String s=str.replaceAll("[()]" , "");
      //String s1=str.replace(")","");
      System.out.println(s);
      //System.out.println(s1);
      
      
    }
  }