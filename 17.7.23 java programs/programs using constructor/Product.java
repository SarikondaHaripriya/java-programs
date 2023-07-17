//Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.
class Product
  {
    String productname;
    int price;
    String quantity;
    Product(String p,int rs,String q)
    {
      productname=p;
      price=rs;
      quantity=q;      
    }
    public void display()
    {
      System.out.println(productname+" "+price+" "+quantity);
    }
    public static void main(String args[])
    {
      Product product=new Product("sugar",15,"250gms");
      Product product1=new Product("rice",55,"1kg");
      Product product2=new Product("soap",55,"250gms");
      product.display();
      product1.display();
      product2.display();
    }
  }