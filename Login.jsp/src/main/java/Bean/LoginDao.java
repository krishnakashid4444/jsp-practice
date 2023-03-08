package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	public static boolean validate(LoginBean bean)
	{
		boolean status=false;
		
		System.out.println(status);
		
		String qry="select * from userloginjsp.info where Email=? and Pass=? ";
		
		
		try
		{
			Connection con=ConnectionProvider.getCon();
			
			System.out.println("Step 1 is done");
			
			PreparedStatement ps=con.prepareStatement(qry);
			
			System.out.println("step 2 is done ");
		    
			ps.setString(1, bean.getEmail());
			ps.setString(2, bean.getPass() );
			
			
			ResultSet rs=ps.executeQuery();
			
			//System.out.println("rs.next()==="+rs.next());
			
		       status=rs.next();
			
			
			System.out.println(status);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}

}
