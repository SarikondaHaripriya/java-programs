class Addition
  {
    public void add()
    {
      System.out.println("the calculator operates on addition");
    }
    public void add(int a,int b)
    {
      System.out.println("the sum of two numbers is"+(a+b));
    }
    public void add(int a,int b,int c)
    {
      System.out.println("the sum of three numbers is"+(a+b+c));
    }
    public void add(int a,int b,int c,int d)
    {
      System.out.println("the sum of the numbers is "+(a+b+c+d));
    }
  }
class Calculator
  {
    public static void main(String args[])
    {
      Addition a=new Addition();
      a.add();
      a.add(12,15);
      a.add(12,60,50);
      a.add(45,50,12,78);
    }
  }