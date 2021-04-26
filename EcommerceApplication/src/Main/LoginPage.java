package Main;

import java.sql.SQLException;
import java.util.Scanner;

import Database.LoginDb;

public class LoginPage {
     public void LoginPage() throws Exception
     {
    	 System.out.println("Enter username :");
    	 Scanner sc=new Scanner(System.in);
   	  String username=sc.nextLine();
   	  System.out.println("Enter password:");
   	  String password=sc.nextLine();
   	  
   	  LoginDb obj=new LoginDb();
   	  boolean loginStatus=obj.checkLoginDb(username, password);
   	  if(loginStatus==true)
   	  {
   		  System.out.println("Login Successful");
   		  
   		  CustomerPage customerObj=new CustomerPage();
   		  customerObj.CustomerPage(username,password);
   		  
   	  }
   	  else
   	  {
   		  System.out.println("Incorrect username or password");
   	  }
     }
}
