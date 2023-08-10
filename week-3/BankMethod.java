import java.util.*;
class BankMethod
  {
    public static void details(String name)
    {
      System.out.println("the account name is"+name);
    }
    public static void acno(int acno)
    {
      System.out.println("the account number is "+acno);
    }
    public static void ifsc(int ifsc)
    {
      System.out.println("ifsc code is"+ifsc);
    }
    public static void address(String address)
    {
      System.out.println("the address of the applicant is "+address);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name of the applicant");
      String bname=sc.nextLine();
      System.out.println("enter account number");
      int ac=sc.nextInt();
      System.out.println("enter ifsc number");
      int ifc=sc.nextInt();
      System.out.println("enter the address");
      String add=sc.nextLine();
      details(bname);
      acno(ac);
      ifsc(ifc);
      address(add);
    }
  }