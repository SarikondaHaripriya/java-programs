import java.util.*;
class PasswordValidation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      do{
        System.out.println("enter a password");
      int userpass=sc.nextInt();
      int syspass=789389;
      if(syspass==userpass)
      {
          System.out.println("password is valid");
        break;
      }
      else
      {        
        System.out.println("re-enter the valid password");
      }
    }while(true);
  }
  }