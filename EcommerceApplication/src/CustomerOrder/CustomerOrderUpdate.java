package CustomerOrder;

import java.sql.SQLException;

import Database.CustomerUpdateDb;

public class CustomerOrderUpdate {
          public void CustomerOrderUpdate (String username,String product,String quantity,float prize) throws Exception
          {
        	  String totalprize=String.valueOf(prize);
//        	  System.out.println(username);
//        	  System.out.println(product);
//        	  System.out.println(quantity);
//        	  System.out.println(totalprize);
        	  CustomerUpdateDb obj_update=new CustomerUpdateDb(); 
        	  obj_update.CustomerUpdateDb(username, product, quantity,totalprize);
          }
}
