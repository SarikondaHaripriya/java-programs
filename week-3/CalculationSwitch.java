import java.util.*;
class CalculationSwitch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);   
      char option;
      do{
        System.out.println("enter an operator to perform");
        System.out.print("+ ->Addition"+"\n"+"- ->Sbtraction"+"\n"+"* -> multiplication"+"\n"+"/ -> division"+"\n"+" %-> remainder");
        char ch=sc.next().charAt(0);
        System.out.println("enter x value");
        int x=sc.nextInt();
        System.out.println("enter y value");
        int y=sc.nextInt();
        switch(ch)
          {
            case '+':
              System.out.println("the addition of x and y is:"+(x+y));
              break;
            case '-':
              System.out.println("the subtraction of x and y is:"+(x-y));
              break;
            case '*':
              System.out.println("the multiplication of x and y is:"+(x*y));
              break;
            case '/':
              System.out.println("the division of x and y is:"+(x/y));
              break;
            case '%':
              System.out.println("the remainder of x and y is:"+(x%y));
              break;
            default:
              System.out.println("invalid operator");
          }
        System.out.println("do you want to continue y/n ");
         option=sc.next().charAt(0); 
      }
      
        while(option=='y'||option=='Y');
    }
  }