import java.util.*;
class AtmTransactions
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      boolean option;
      do
        {
      System.out.println("enter the option to perform the operation");      System.out.print("1.withdrawl"+"\n"+"2.Deposit"+"\n"+"3.balance enquiry"+"\n"+"4.exit");
      int choice=sc.nextInt();
      switch(choice)
        {
          case 1:
            System.out.println("enter the money for withdrawl");
            double withdrawl=sc.nextDouble();
            double balance=12000.00;
            if(balance==withdrawl)
            {
              System.out.println("withdrawl successful");
            }
             else
            {
              System.out.println("insufficient balance");
            }
            break;
          case 2:
            System.out.println("enter the money for deposit");
            double deposit=sc.nextDouble();
            System.out.println("deposit successful");
            break;
          case 3:
            double bal=12000.00;
            System.out.println("the balance available is "+bal);
            break;
          case 4:
            System.exit(0);
            System.out.println("Exit");
            break;
          default:
            System.out.println("invalid option");
        }
                     
        }
        while(true);
    }
  }