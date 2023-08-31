import java.util.*;
class VectorEx
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter thesize of the vector");
      int n=sc.nextInt();
      System.out.println("enter the vector elements");
      Vector<String> vec=new Vector<String>();
      for(int i=0;i<n;i++)
        {
          String element=sc.next();
          vec.add(element);
        }
      System.out.println("the elements in vector are");
      for(String v:vec)
        {
          System.out.println(v);
        }
      vec.add(3,"cat");
      vec.remove(4);
      Vector<String> vec1=new Vector<String>();
      vec1.add("pegion");
      vec1.add("dog");
      vec1.addAll(vec);
      System.out.println(vec1);
      Collections.sort(vec1);
      System.out.println(vec);
      System.out.println("the size of the vector is"+vec1.size());
    }
  }