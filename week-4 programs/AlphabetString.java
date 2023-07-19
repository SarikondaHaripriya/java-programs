import java.util.*;
class AlphabetString
  {
    public static void main(String args[])
    {
      int alphabetcount=0;
      int digitcount=0;
      int specialcharacter=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String s=sc.nextLine();
      for(int i=0;i<s.length();i++)
        {
          char ch=s.charAt(i);
          if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
          {
            alphabetcount=alphabetcount+1;
          }
          else if(ch>='0'||ch<='9')
          {
            digitcount=digitcount+1;
          }
          else
          {
            specialcharacter=specialcharacter+1;
          }
        }
      System.out.println("the number of values in the string are"+alphabetcount);
      System.out.println("the number of digit values in the string are"+digitcount);
      System.out.println("the number of special charcters are "+specialcharacter);
    }
  }