class Threads implements Runnable
  {
    public void run()
    {
      for(int i=0;i<=10;i++)
        {
          System.out.println(i +"id is "+Thread.currentThread().getId());
        }
    }
  }
class RunThread
  {
    public static void main(String args[])
    {
      Threads t=new Threads();
      Thread th=new Thread(t);
      Threads t1=new Threads();
      Thread th1=new Thread(th);
      th.start();
      th1.start();
    }
  }