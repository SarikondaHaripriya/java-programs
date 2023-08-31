import java.util.*;
class DeQueueEx
  {
    public static void main(String args[])
    {
      ArrayDeque<String> que=new ArrayDeque<String>();
      que.add("vizag");
      que.add("kadapa");
      que.add("kurnool");
      que.add("chitoor");
      System.out.println(que);
      que.offer("vijayawada");
      //que.offer(null);
      for(String st:que)
        {
          System.out.println(st);
        }
      System.out.println(que.remove());
      ArrayDeque<Integer> q=new ArrayDeque<Integer>();
      System.out.println(q.poll());
      System.out.println(que.element());
      System.out.println(que.offerFirst("hyd"));
      System.out.println(que);
      System.out.println(q.offerLast(123));
      System.out.println(q.offerFirst(145));
      System.out.println(q);
      System.out.println(que.peekFirst());
      System.out.println(que.peekLast());
      System.out.println(q.remove());
      System.out.println(q);
      
      
    }
  }