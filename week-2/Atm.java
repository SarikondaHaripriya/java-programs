import java.util.*;
class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Atm transactions");
      System.out.println("enter your choice");
      System.out.println("choices are"+"\n"+"1 deposit"+"\n"+"2 withdraw"+"\n"+"3 balance enquiry"+"\n"+"4 change pin");
      int choice=sc.nextInt();
      double balance=45000;
      switch(choice)
        {
          case 1:
            System.out.println("entered choice is deposit");
            System.out.println("enter the amount to deposit");
            double deposit=sc.nextDouble();
            double total=balance+deposit;
            System.out.println("deposit succesful"+total);
            break;
          case 2:
            System.out.println("entered choice is withdrawl ");
            System.out.println("enter amount to withdraw");
            double withdraw=sc.nextDouble();
            if(withdraw<balance)
            {
              double result=balance-withdraw;
              System.out.println("withdrawl successful"+result);  
            }
            else{
              System.out.println("insufficient balance");         
            }
            break;
          case 3:
            System.out.println("entered choice is balance enquiry");
            System.out.println("your bank balance is "+balance);
            break;
          case 4:
            System.out.println("entered choice is change pin");
            System.out.println("enter your pin");
            int pin=sc.nextInt();
            if(pin==12345)
            {
              System.out.println("valid pin");
            }
            else{
              System.out.println("invalid pin");
            }
        }
    }
  }
      
