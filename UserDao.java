package DbPatterns;

import java.util.Set;

public interface UserDao {
	
	User getUser(int id);
	Set<User> getAllUser();
	User getUserByUserNameAndPassword(String user, String pass);
	boolean insertUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(int id);
	
}
