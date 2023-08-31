import java.util.*;
class StackEx
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Stack<String> s=new Stack<String>();
      System.out.println("enter the size of the stack");
      int n=sc.nextInt();
      System.out.println("enter stack elements");
      for(int i=0;i<n;i++)
        {
          String value=sc.next();
          s.push(value);
        }
      System.out.println("the elements in the stack are");
      for(String st:s)
        {
          System.out.println(st);
        }
      s.push("grapes");
      s.pop();
      System.out.println(s);
      s.set(1,"apple");
      System.out.println("the fruit banana is present in stack "+s.contains("banana"));
      System.out.println(s);
      Collections.sort(s);
      Iterator i=s.iterator();
      while(i.hasNext())
        {
          System.out.println(i.next());
        }
    }
  }