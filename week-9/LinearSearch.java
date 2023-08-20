import java.util.*;
class LinearSearch
  {
    public static void linearSearch(int a[],int key,int n)
    {
      boolean find=false;
      int index=-1;
      for(int i=0;i<n;i++)
        {
          if(key==a[i])
          {
            find=true;
            index=i;
            break;
          }
        }
      if(find==true)
      {
        System.out.println("elements is found at"+index+"position");
      }
      else{
        System.out.println("element not found");
      }
    }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
          System.out.println("enter the array size");
          int n=sc.nextInt();
          int a[]=new int[n];
          System.out.println("enter array elements");
          for(int i=0;i<n;i++)
            {
              a[i]=sc.nextInt();
            }
          System.out.println("enter the element you want to search");
          int key=sc.nextInt();
          linearSearch(a,key,n);
        }
    }
  