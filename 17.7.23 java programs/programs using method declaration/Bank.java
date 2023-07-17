//Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.
class Bank
  {
    String accname;
    double balance;
    public void initialise(String n,double bal)
    {
      accname=n;
      balance=bal;
    }
    public void display()
    {
      System.out.println("the account name is "+accname);
      System.out.println("the balance available in the account is "+balance);
    }
    public static void main(String args[])
    {
      Bank acc=new Bank();
      acc.initialise("priya",3000.00);
      acc.display();
      Bank acc1=new Bank();
      acc1.initialise("jayasri",10000.56);
      acc1.display();
      Bank acc2=new Bank();
      acc2.initialise("prashanthi",4500.20);
      acc2.display();
    }
  }