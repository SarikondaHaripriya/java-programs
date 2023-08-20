import java.util.*;
class BinarySearch
  {
    public static void binary(int a[],int first,int last,int key)
    {
      int mid=(first+last)/2;
      while(first<=last)
        {
          if(a[mid]<key)
          {
            first=mid+1;
          }
          else if(a[mid]==key)
          {
            System.out.println("element is found at postion"+mid);
            break;
          }
          else{
            last=mid-1;
          }
          mid=(first+last)/2;
        }
      if(first>last)
      {
        System.out.println("element is not found");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter key element");
      int key=sc.nextInt();
      int first=0;
      int last=n-1;
      binary(a,first,last,key);
    }
  }