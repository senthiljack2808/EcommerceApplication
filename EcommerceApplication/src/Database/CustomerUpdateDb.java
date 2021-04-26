package Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class CustomerUpdateDb {
	private static final String update="INSERT INTO `orders` (`username`, `product_name`, `quantity`, `price`) VALUES (?, ?, ?, ?);"; 
   public void CustomerUpdateDb (String username,String product,String quantity,String prize) throws SQLException
   {
	   Connection con=(Connection) DBconnection.getConnection();
	   PreparedStatement psmt=con.prepareStatement(update);
	   psmt.setString(1, username);
	   psmt.setString(2, product);
	   psmt.setString(3, quantity);
	   psmt.setString(4, prize);
	   psmt.executeUpdate();
	   
   }
}
