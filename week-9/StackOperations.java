import java.util.*;
class StackOperations
  {
    int maxSize;
    int stackArray[];
    int top;
    public StackOperations(int size)
    {
      maxSize=size;
      stackArray=new int[maxSize];
      top=-1;
    }
    public void push(int value)
    {
      if(top<=maxSize-1)
      {
        top++;
        stackArray[top]=value;
        System.out.println("element pushed into the stack");
      }
      else{
        System.out.println("stack is full");
      }
    }
    public void pop()
    {
      if(top!=0)
      {
        int popvalue=stackArray[top];
        top--;
        System.out.println("element is poped from the stack");
      }
      else{
        System.out.println("stack is in underflow condition cannot pop");
      }
    }
    public void show()
    {
      if(top>=0)
      {
        System.out.println("the stack is");
        for(int i=0;i<=top-1;i++)
          {
            System.out.println(stackArray[i]+" ");
          }
        System.out.println();
      }        
      else{
        System.out.println("the stack is empty");
      }
    }
    public void peek()
    {
      if(top>=0)
      {
        int peekvalue=stackArray[top];
        System.out.println("peekvalue is"+peekvalue);
      }
      else{
        System.out.println("Stack is empty");
      }
    }    
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      StackOperations s=new StackOperations(sc.nextInt());
      do
        {
          System.out.println(" 1.push \n 2.pop \n 3.peek \n 4.display \n 5.exit");
    System.out.println("enter your choice");
      int option=sc.nextInt();
      switch(option)
        {
          case 1:
            System.out.println("enter element to push");
            int value=sc.nextInt();
            s.push(value);
            break;
          case 2:
            s.pop();
            break;
          case 3:
            s.peek();
            break;
          case 4:
            s.show();
            break;
          case 5:
            System.exit(0);
            break;
        }
        }while(true);
    }
  }