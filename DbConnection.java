import java.sql.*;

public class DbConnection {

	public static void main(String[] args) {
		try{  
			 
			
			System.setProperty("oracle.net.tns_admin",
			        "C:/app/hrish/product/12.2.0/dbhome_1/network/admin");
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@orclpdb","hr","hr123");
					
					
		
			 
		
			
			//step4 execute 
			
			PreparedStatement ps=con.prepareStatement("select * from employees");  
			ResultSet rs=ps.executeQuery();  
			ResultSetMetaData rsmd=rs.getMetaData();  
			  
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
			
			  
			//step5 close the connection object  
			con.close();  
			  
			}
		
		catch(Exception e)
		  { 
			System.out.println(e);
			} 
		}

}
