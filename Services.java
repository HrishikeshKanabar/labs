package DbPatterns;

import java.sql.Connection;
import java.util.Set;
import java.sql.*;

public  class Services implements UserDao {
	
	// get user service or method 

	public User getUser(int id) {

	Connection con =ConnectionFactory.getConnection();
   
			 try {
				 
				 
				 Statement stmt = con.createStatement();
				 ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id="+id);
			 
						 if(rs.next())
							 
				             {
				 
				                 User user = new User();
				
				                 user.setId( rs.getInt("id") );
		                         user.setName( rs.getString("name") );
		                         user.setPass( rs.getString("pass") );
		                         user.setAge( rs.getInt("age") );
					
		                         return user;
						             }
		 
			 
			 }catch (SQLException ex) {
				
		         ex.printStackTrace();
		     }

			 return null;

  }
	
	
	// get user by password and user name
	
	public User getUserByUserNameAndPassword(String user, String pass) {
		
		  
		
		Connection con =ConnectionFactory.getConnection();
		
		    try {
		
		        PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE user=? AND pass=?");
	
		        ps.setString(1, user);
	
		        ps.setString(2, pass);
		
		        ResultSet rs = ps.executeQuery();
	
		        if(rs.next())
		        {
	
		        	User user1 = new User();
		        	
		        	 user1.setId(rs.getInt("id") );
		        	 user1.setName(rs.getString("name"));
		        	 user1.setPass(rs.getString("pass"));
		        	 user1.setAge( rs.getInt("age"));
		        	 
		        	 return user1;
		
		        }
		        
		    } catch (SQLException ex) {
		
		        ex.printStackTrace();
		
		    }
	  
			return null;
		}



// insert user 
	
	
	public boolean insertUser(User user) {
		
		 
		
		Connection con =ConnectionFactory.getConnection();
		
		    try {
		
		        PreparedStatement ps = con.prepareStatement("INSERT INTO user VALUES (NULL, ?, ?, ?)");
		
		        ps.setString(1, user.getName());
		
		        ps.setString(2, user.getPass());
		
		       ps.setInt(3, user.getAge());
		
		        int i = ps.executeUpdate();
		        
		    if(i == 1) {
		
		        return true;
		    }
		    
		    } catch (SQLException ex) {
		
		        ex.printStackTrace();
	
		    }
		

		    return false;
		
		}


 // update user  service

	
	
	public boolean updateUser(User user) {
	
	   

		Connection con =ConnectionFactory.getConnection();
	
	    try {

	        PreparedStatement ps = con.prepareStatement("UPDATE user SET name=?, pass=?, age=? WHERE id=?");

	        ps.setString(1, user.getName());

	        ps.setString(2, user.getPass());

	        ps.setInt(3, user.getAge());

	        ps.setInt(4, user.getId());

	        int i = ps.executeUpdate();

	      if(i == 1) {

	    return true;

	      }


	    } catch (SQLException ex) {

	        ex.printStackTrace();

	    }

	    return false;

	}
	
// Delete method
	
	
	public boolean deleteUser(int id) {

		  Connection con =ConnectionFactory.getConnection();

		    

		    try {

		        Statement stmt = con.createStatement();

		        int i = stmt.executeUpdate("DELETE FROM user WHERE id=" + id);


		      if(i == 1) {

		    return true;

		      }

		    } catch (SQLException ex) {

		        ex.printStackTrace();

		    }

		    return false;

		}


	@Override
	public Set<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}


	

	
}
