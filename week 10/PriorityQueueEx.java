import java.util.*;
class PriorityQueueEx
  {
    public static void main(String args[])
    {
      PriorityQueue<String> queue=new PriorityQueue<String>();
      queue.add("priya");
      queue.add("jayasri");
      queue.add("prashanthi");
      System.out.println(queue);
      queue.offer("jeevani");
      Iterator itr=queue.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      queue.remove();
      System.out.println(queue);
      System.out.println(queue.element());
      System.out.println(queue);
      System.out.println("the head of the queue using peek "+queue.peek());
      PriorityQueue<String> que=new PriorityQueue<String>();
      System.out.println(que.poll());
      //System.out.println(que.element());
    }
  }