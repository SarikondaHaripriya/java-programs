class MyThread extends Thread
  {
    public void run()
    {
      System.out.println("this is child class");
    }
  }
class Threads
  {
    public static void main(String args[])
    {
      MyThread mt=new MyThread();
      mt.start();
    }
  }