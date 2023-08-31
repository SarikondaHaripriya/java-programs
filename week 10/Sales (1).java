/*Scenario: Managing a Store's Products
As a store manager, you are responsible for managing all the operations related to the products in your store. You have a system that stores all the product details (product_id, name, category, price) in an ArrayList of Product objects.
Your task is to create a Java program that helps you manage the store efficiently.
Create a console-based menu-driven program that allows the user to perform the following operations:
Add products.
Calculate the total price of all products.
Remove a product by product_id.
Update the price of a product by product_id.
Search products by category.
Quit the program.
If no products are found for the given category, the program should provide an appropriate message indicating that no products were found.*/
import java.util.*;
class Product
  {
    int id;
    String name;
    String category;
    double price;
    Product(int id,String name,String category,double price)
    {
      this.id=id;
      this.name=name;
      this.category=category;
      this.price=price;
    }    
  }
class Sales
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      
    }
  }