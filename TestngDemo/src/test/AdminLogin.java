 package test;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;




public class AdminLogin 
{   
	@Parameters({"uid","pwd"}) 
	@Test   
	public static void checkAdminLogin(String UID,String PWD)
	  {
		  System.out.println("Admin Login Test with "+UID+","+PWD);
	  }
	  

}
