package Main;

import java.sql.SQLException;
import java.util.Scanner;

import CustomerOrder.CustomerOrder;
import ViewProduct.ViewProduct;

public class CustomerPage {
  public void CustomerPage (String username,String password) throws Exception
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Press 1 to view Products");
	  System.out.println("Press 2 to Buy Products");
	  int choice=sc.nextInt();
	  
	  if(choice==1)
	  {
		  ViewProduct viewObj=new ViewProduct();
		  viewObj.viewProduct();
	  }
	  else if(choice==2)
	  {
		  CustomerOrder custOrderObj=new CustomerOrder();
		  custOrderObj.CustomerOrder(username);
	  }
	  
  }
}
