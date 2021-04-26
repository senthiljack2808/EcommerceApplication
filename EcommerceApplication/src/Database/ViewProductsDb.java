package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ViewProductsDb {
 private static final String view="SELECT * FROM `product`";
public ArrayList<ArrayList<String>> ViewProductsDb () throws SQLException
 {
      	 Connection con=(Connection) DBconnection.getConnection();
      	 PreparedStatement psmt=(PreparedStatement) con.prepareStatement(view);
      	 ResultSet rs=psmt.executeQuery();
      	 ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>();
      	 while(rs.next())
      	 {
      		 ArrayList<String> temp=new ArrayList<String>();
      		 temp.add(rs.getString(1));
      		temp.add(rs.getString(2));
      		temp.add(rs.getString(3));
      		temp.add(rs.getString(4));
      		temp.add(rs.getString(5));
	      	res.add(temp);
      	 }
      	 
      	 return res;
 }
	
}
