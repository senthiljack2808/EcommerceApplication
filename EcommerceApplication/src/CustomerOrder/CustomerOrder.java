package CustomerOrder;

import java.sql.SQLException;
import java.util.Scanner;

import ViewProduct.ViewProduct;

public class CustomerOrder {
  
	public void CustomerOrder(String username) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("****Available products*****");
		  ViewProduct viewObj=new ViewProduct();
		  viewObj.viewProduct();
		  System.out.println("******************************************************");
		  System.out.println();
		  System.out.println("You are now ready for ordering");
		  boolean val=true;
		  while(val)
		  {
		  System.out.println("Enter the product name");
		  String productName=sc.nextLine();
		  CustomerOrderPart2 cusObj=new CustomerOrderPart2();
		  cusObj.CustomerOrderPart2(username, productName);
		  System.out.println("Press 1 to continue shopping");
		  System.out.println("Press 0 to Stop shopping");
		  String ContinueBuying=sc.nextLine();
		  if(Integer.parseInt(ContinueBuying)==1)
		  {
			  val=true;
		  }
		  else if(Integer.parseInt(ContinueBuying)==0)
		  {
			  System.out.println("*******Thanks for Shopping*****visit again****");
			  val=false;
			  break;
		  }
		      
		  }
		  System.out.println("*****Here is your order History****");
		  OrderHistory orderObj=new OrderHistory(); 
		  orderObj.OrderHistory(username);
		  
		  
	}
}
