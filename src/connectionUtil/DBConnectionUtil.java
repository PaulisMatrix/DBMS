package connectionUtil;
import java.sql.*;

public class DBConnectionUtil {
	
	//define database properties
	private static final String username="Rushi";
	private static final String password="pict123";
	private static final String jdbcUrl="jdbc:mysql://localhost:3306/emp";
	private static final String driver="com.mysql.jdbc.Driver";
	private static Connection connection;
	
	
	
	//define static method
	public static Connection openConnection()
	{
		//check the connection
		if(connection!=null)
			return connection;
		
		else {
			try {
				
				//load the driver 
				Class.forName(driver);
				
				//get the connection
				connection=DriverManager.getConnection(jdbcUrl,username,password);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return connection;
		}
		
	}

}
