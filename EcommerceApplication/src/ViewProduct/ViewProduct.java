package ViewProduct;

import java.sql.SQLException;
import java.util.ArrayList;

import Database.ViewProductsDb;

public class ViewProduct {
 public void viewProduct() throws SQLException
 {
	 int i,j;
	 ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>();
	 ViewProductsDb viewObj=new ViewProductsDb();
	 res= viewObj.ViewProductsDb();
	 
	 System.out.println("product_no. "+"product_name  "+"quantity  "+"   discount "+"    Prize ");
	 for(i=0;i<res.size();i++)
	 {
		 for(j=0;j<res.get(i).size();j++)
		 {
			 System.out.print(res.get(i).get(j));
			 System.out.print("           ");
		 }
		 System.out.println();
	 }
 }
}
