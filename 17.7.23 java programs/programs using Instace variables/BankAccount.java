/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement methods to deposit and withdraw money from the account, and display the current balance.*/
class BankAccount
  {
    int accno;
    String accname;
    float balance;
    public void bankdetails()
    {
      System.out.println("the bank account number is"+accno);
      System.out.println("the banck account name is"+accname);
    }
    public static void main(String args[])
    {
      BankAccount b=new BankAccount();
      
    }
  }