import java.util.*;
class BasicSalary
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Basic Salary : ");
    double basic=in.nextDouble();
      double hra,da,gross;
    if(basic<=10000)
    {
      hra= (basic*20)/100;
      da=(basic*80)/100;
  }    
        else if(basic <=20000)
    {
        hra=(basic*25)/100;
      da=(basic*90)/100;
    }
    else
    {
        hra=(basic*30)/100;
      da=(basic*95)/100;
    }
    gross = basic + hra + da;
    System.out.println("The Gross Salary is :"+gross);   
}
}