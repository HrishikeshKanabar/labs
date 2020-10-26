package DbPatterns;
import java.sql.*;

public class ConnectionFactory {

	public static Connection getConnection() {
	
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			System.setProperty("oracle.net.tns_admin",
			        "C:/app/hrish/product/12.2.0/dbhome_1/network/admin");
			  
			//step2 create  the connection object 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@orclpdb","hr","hr123");
		    return con;
		    
	   }catch(Exception e) {
	
	      throw new RuntimeException("ERROR connecting to the database",e);
	   
	   }
	}   

	
	/**
	 Test Connection
	 **/
	
	public static void main(String[] args) {
		Connection con =ConnectionFactory.getConnection();
		System.out.print("Connection successful:  "+con);
	}
}

