package CustomerOrder;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Database.CustomerOrderDb;

public class CustomerOrderPart2 {
    public void CustomerOrderPart2(String username,String productname) throws Exception
    {
    	Scanner sc=new Scanner(System.in);
    	ArrayList<String > res=new ArrayList<String>(); 
		CustomerOrderDb cusObj=new CustomerOrderDb ();
		res=cusObj.CustomerOrderDb(productname);
		System.out.println("Enter the no. of quantity you need to buy");
		String quantity=sc.nextLine();
		String discount=res.get(0);
		String prize=res.get(1);
		
		float discountValueInNumber=Float.parseFloat(discount)/100;
		//System.out.println("dis "+discountValueInNumber);
		float discountPrize = discountValueInNumber*Float.parseFloat(prize)*Float.parseFloat(quantity);
		//System.out.println("dp "+discountPrize);
		float tot_After_dis=Float.parseFloat(prize)*Float.parseFloat(quantity)-discountPrize;
		
		//System.out.println("tot "+tot_After_dis);
		CustomerOrderUpdate update=new CustomerOrderUpdate(); 
		update.CustomerOrderUpdate(username,productname,quantity,tot_After_dis);
		
		     
		
    }
}
