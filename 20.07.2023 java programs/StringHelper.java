/*Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:

Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.*/
class Strings
  {
    public void concatenate(String str1,String str2)
    {
      System.out.println("after concatination the strings are"+str1.concat(str2));
    }
    public void concatenate(String str1,String str2,String str3)
    {
      String str=str1.concat(str2);
      System.out.println("the concatination of three strings is"+str.concat(str3));
    }

  }
class StringHelper
  {
public static void main(String args[])
  {
    Strings s=new Strings();
    s.concatenate("java","programming");
    s.concatenate("welcome","java","interns");
    
  }
  }