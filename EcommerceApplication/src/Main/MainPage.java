package Main;

import java.sql.SQLException;
import java.util.Scanner;

import Database.LoginDb;



public class MainPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("1. Enter to login");
          System.out.println("2. Enter to register");
          String loginOrRes=sc.nextLine();
          
          
          if(Integer.parseInt(loginOrRes)==1)
          {
        	  LoginPage loginPageObj=new LoginPage();
        	  loginPageObj.LoginPage();
           }
          else if(Integer.parseInt(loginOrRes)==2)
          {
        	  RegisterationPage registerObj=new RegisterationPage();
        	  registerObj.RegisterationPage();
          }
          else
          {
        	  System.out.println("Invalid entry ********!!!!!please check");
          }
	}

}
