package auth;

public class UserDAO {

	package auth;

	import java.sql.Connection;
	import java.util.HashMap;

	/**
	 * Data Access Object for User
	 */
	public class UserDAO {

	    private Connection connection; // For real DB use
	    private HashMap<String, User> users = new HashMap<>();

	    /**
	     * Finds user by username
	     */
	    public User findByUsername(String username) {
	        return users.get(username);
	    }

	    /**
	     * Saves a new user
	     */
	    public boolean saveUser(User user) {
	        users.put(user.getUsername(), user);
	        return true;
	    }

	    /**
	     * Updates user password
	     */
	    public boolean updatePassword(int userId, String newPassword) {
	        for (User user : users.values()) {
	            if (user.getUserId() == userId) {
	                user.setPassword(newPassword);
	                return true;
	            }
	        }
	        return false;
	    }

	    /**
	     * Deletes a user
	     */
	    public boolean deleteUser(int userId) {
	        return users.values().removeIf(user -> user.getUserId() == userId);
	    }
	}

}
