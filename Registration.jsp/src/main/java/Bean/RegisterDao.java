package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {
	
          public static int register(User u)
          {
        	  int status=0;
        	  
        	  System.out.println("status"+status);
        	  String url="insert into userregisterjsp.info values(?,?,?)";
        	  
        	  try
        	  {
        		  
        		  
        		  Connection con=ConnectionProvider.getCon();
        		  
        		  System.out.println("Step one is done");
        		  
        		  PreparedStatement ps=con.prepareStatement(url);
        		  System.out.println("Step 2 is done");
        		  ps.setString(1,u.getUname());
        		  ps.setString(2, u.getUemail());
        		  ps.setString(3,u.getUpass());
        		  
        		  System.out.println("Step 3 is done");
        		  
        		 status=ps.executeUpdate();
        		  
        		  
        		  System.out.println("Step 4 is done");
        		  
        		  System.out.println("status"+status);
        		  
        		  
        	  }
        	  catch(Exception e)
        	  {
        		  e.printStackTrace(); // if you not write this then exception will hide means not visible.
        	  }
        	  return status;
        	  
          }

}
