import java.util.*;
class NumberGuessingGame{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=50;
    System.out.println("Guessing game");
System.out.println("enter the guessing number  ");
    char option;
    do{
    int p=sc.nextInt();
        if(p>n)
        {
          System.out.println("the number is higher");
        }
        else if(p<n)
        {
          System.out.println("the number is lower than actual number");
        }
        else{
          System.out.println("the number is matched");
        }
      System.out.println("do you want to continue gaming yes or no");
option=sc.next().charAt(0);

      }while(option=='y'||option=='Y');
  }
  }
