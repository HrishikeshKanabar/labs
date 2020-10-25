import java.sql.Connection;
import java.sql.DriverManager;

public class DbResultsetMetadataInterface {

	public static void main(String[] args) {
		
		
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			
			System.setProperty("oracle.net.tns_admin",
			        "C:/app/hrish/product/12.2.0/dbhome_1/network/admin");
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@orclpdb","hr","hr123");
			
			

	}catch(Exception e)
		  { 
			System.out.println(e);
			} 

}
}
