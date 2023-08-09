class Threads extends Thread
{
  public void run()
  {
  for(int i=0;i<=5;i++)
  {
    System.out.println(i +"id is "+Thread.currentThread().getId());
  }
}
}
class SampleThread
  {
    public static void main(String args[])
    {
      Threads t=new Threads();
      Threads t1=new Threads();
      t.start();
      t1.start();
    }
  }