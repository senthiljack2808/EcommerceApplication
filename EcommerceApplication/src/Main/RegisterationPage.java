package Main;

import java.sql.SQLException;
import java.util.Scanner;

import Database.RegisterDb;

public class RegisterationPage {
    public void RegisterationPage() throws SQLException 
    {
    	  Scanner sc=new Scanner(System.in);
    	System.out.println("Enter email_id");
  	  String email=sc.nextLine();
  	  System.out.println("Enter password");
  	  String password =sc.nextLine();
  	  System.out.println("Enter phone number");
  	  String phonenumber =sc.nextLine();
  	  
  	  RegisterDb obj=new RegisterDb();
  	  obj.makeRegisteration(email, password, phonenumber);
    }
}
