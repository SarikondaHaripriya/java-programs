class Wrapper
  {
    public static void main(String args[])
    {
      int x=100;
      Integer y=Integer.valueOf(x);
      Integer w=x;
      System.out.println(x+" "+y+" "+w);
      int i=w;
      System.out.println(i);
    }
  }