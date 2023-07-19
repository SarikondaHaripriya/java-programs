import java.util.*;
class VowelConsonant
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      int vowelcount=0;
      int consonantcount=0;
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U'))
          {
            vowelcount=vowelcount+1;
          }
          else{
            consonantcount=consonantcount+1;
          }
        }
      System.out.println("the vowel count in the string is"+vowelcount);
      System.out.println("the conosonant count in the string is "+consonantcount);
    }
  }