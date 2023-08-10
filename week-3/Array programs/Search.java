import java.util.*;
class Search
  {
    public static void search(int a[],int size,int value)
    {
      int count=0,i;
      for(i=0;i<size;i++)
        {
          if(a[i]==value)
          {
            count++;
            break;
          }
          }
      if(count>0)
      {
        System.out.println("the searching value is found at index"+i);
      }
        else
          {          
         System.out.println("searching element not found");   
          }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the value you want to search");
      int value=sc.nextInt();
      search(a,size,value);
    }
  }