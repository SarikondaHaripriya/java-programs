interface Calculator
  {
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
  }
class Operation implements Calculator
  {
    public void add(int a,int b)
    {
      System.out.println(a+b);
    }
    public void sub(int a,int b)
    {
      System.out.println(a-b);
    }
    public void mul(int a,int b)
    {
      System.out.println(a*b);
    }
    public void div(int a,int b)
    {
      System.out.println(a/b);
    }
  }
class Interfaceex
  {
    public static void main(String args[])
    {
     Calculator cal=new Operation();
      cal.add(27,56);
      cal.sub(85,45);
      cal.mul(45,6);
      cal.div(850,62);
    }
  }