package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LoginDb {
	private final static String Login="select * from customer ";
	
    public boolean checkLoginDb(String username,String password) throws SQLException
    {
    	Connection con=DBconnection.getConnection();
    	 PreparedStatement psmt=con.prepareStatement(Login);
    	 ResultSet rs=psmt.executeQuery();
		 while(rs.next())
		   {
			   if(username.equals(rs.getString("username")))
			   {
				   if(password.equals(rs.getString("password")))
				   {
					
					  return true;
					
					   
				   }
			   }
		   }
		return false;
    }
}
