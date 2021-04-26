package CustomerOrder;

import java.sql.SQLException;
import java.util.ArrayList;

import Database.OrderHistoryDb;

public class OrderHistory {
        public void OrderHistory(String username) throws SQLException
        {
        	int i,j,k;
        	  ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>();
        	OrderHistoryDb obj=new OrderHistoryDb();
        	res=obj.OrderHistoryDb(username);
        	
        	System.out.println();
        	System.out.println("**********Customer Name*******:  "+username.toUpperCase());
        	System.out.println();
        	System.out.println("Product_name    |"+"Quantity  |"+"  Prize      |");
        	for(i=0;i<res.size();i++)
        	{
        		for(j=0;j< res.get(i).size();j++)
        		{
        			
        			System.out.print(res.get(i).get(j)+"           |");
        			
        		}
        		System.out.println();
        	}
        	int sum=0;
        	for(i=0;i< res.size();i++)
        	{
        		sum= sum + Integer.parseInt(res.get(i).get(2));
        		
        	}
          
			//System.out.println("sum "+sum);
        	System.out.println("****Total amount You have purchased *** $"+sum);
        }
}

