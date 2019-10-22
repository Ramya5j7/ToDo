package ToDo.SqlOperation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
Connection conn=null;
public static Connection dbConnector()
{
   try {
   	
   	String url = "jdbc:mysql://localhost:3307/ToDo";
   	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
   	Connection con = DriverManager.getConnection (url, "root", "password@123");
   
   	return con;
   	
   }
   catch(Exception e)
   {
   	System.out.println(e);
   	return null; 
   }
}
}

