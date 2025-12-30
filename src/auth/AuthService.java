package auth;

public class AuthService {


	    private UserDAO userDAO = new UserDAO();

	    /**
	     * Validates user credentials
	     */
	    public boolean authenticate(String username, String password) {
	        User user = userDAO.findByUsername(username);
	        return user != null && user.getPassword().equals(password);
	    }

	    /**
	     * Changes user password after validation
	     */
	    public boolean changePassword(int userId, String oldPassword, String newPassword) {
	        for (User user : userDAO.users.values()) {
	            if (user.getUserId() == userId && user.getPassword().equals(oldPassword)) {
	                return userDAO.updatePassword(userId, newPassword);
	            }
	        }
	        return false;
	    }

	    /**
	     * Adds demo user
	     */
	    public void addSampleUser() {
	        userDAO.saveUser(new User(1, "admin", "admin123"));
	    }
	}

}
