import java.util.*;

class OddContinue {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the starting range");
    int a = sc.nextInt();
    System.out.println("enter the ending range");
    int b=sc.nextInt();
    int i;
    char option;
    do{
    for(i=a;i<=b;i++)
      {
        if(i%2==0)
        {
          continue;
        }
        System.out.println(i);
      }
    System.out.println("do you want to continue y/n");
      option=sc.next().charAt(0);
    }while((option=='y')||(option=='Y'));
  }
}