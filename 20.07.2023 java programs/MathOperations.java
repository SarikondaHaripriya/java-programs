/*
Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:

Perform addition.

Perform subtraction.

Perform multiplication.

Perform division.*/
class Operations
  {
    public void operator()
    {
      System.out.println("the math operations are");
    }
    public void operator(int a,int b)
    {
      System.out.println("the addition sum is"+(a+b));
    }
    public void operator(int a,float b)
    {
      System.out.println("the subtraction value is "+(a-b));
    }
    public void operator(float a,float b)
    {
      System.out.println("the multiplication value is"+(a*b));
    }
    public void operator(float a,int b)
    {
      System.out.println("the divident value is"+(a/b));
    }
  }
class MathOperations
  {
    public static void main(String args[])
    {
      Operations o=new Operations();
      o.operator();
      o.operator(12,32);
      o.operator(82,45.2f);
      o.operator(45.23f,62.3f);
      o.operator(56.2f,6);
    }
  }