package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class OrderHistoryDb {
	private static final String order="SELECT `product_name`, `quantity`, `price` FROM `orders` WHERE username=?";
	  public ArrayList<ArrayList<String>> OrderHistoryDb (String username) throws SQLException 
      {
		  ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>(); 
      	Connection con=(Connection) DBconnection.getConnection();
      	PreparedStatement psmt=(PreparedStatement) con.prepareStatement(order);
      	psmt.setString(1, username);
      	ResultSet rs=psmt.executeQuery();
      	while(rs.next())
      	{
      		ArrayList<String> temp=new ArrayList<String>();
      		temp.add(rs.getString(1));
      		temp.add(rs.getString(2));
      		temp.add(rs.getString(3));
      		res.add(temp);
      	}
      	return res;
      	
      }
}
