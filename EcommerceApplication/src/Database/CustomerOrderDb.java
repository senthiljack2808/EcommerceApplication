package Database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CustomerOrderDb {
	private static final String product="SELECT `discount`, `price` FROM `product` WHERE name=?";
	public ArrayList<String> CustomerOrderDb(String productName) throws SQLException
	{
		ArrayList<String> al=new ArrayList<String>(); 
		Connection con=(Connection) DBconnection.getConnection();
		PreparedStatement     psmt=(PreparedStatement) con.prepareStatement(product);
		psmt.setString(1, productName);
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			//System.out.println(rs.getString(1));
			//System.out.println(rs.getString(2));
			al.add(rs.getString(1));
			al.add(rs.getString(2));
		}
		return al;
	}

}
