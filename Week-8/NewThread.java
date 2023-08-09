class MyThread implements Runnable
  {
    public void run()
    {
      for(int i=0;i<=10;i++)
        {
          System.out.println(i+" id is"+Thread.currentThread().getId());
          try{
            Thread.sleep(1000);
          }
          catch(Exception e)
            {
              System.out.println(e);
            }
        }      
    }
  }
class NewThread
  {
    public static void main(String args[])
    {
      MyThread mt=new MyThread();
      Thread t=new Thread(mt);
      t.start();
      MyThread mt1=new MyThread();
      Thread t1=new Thread(mt1);
      t1.start();
      try{
        t.join();
      }
      catch(Exception e)
        {
          System.out.println(e);
        }
      try
        {
          t1.join();
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
    }
  }