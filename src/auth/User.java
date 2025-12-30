package auth;

public class User {


	    private int userId;
	    private String username;
	    private String password;

	    /**
	     * Constructor for User
	     */
	    public User(int userId, String username, String password) {
	        this.userId = userId;
	        this.username = username;
	        this.password = password;
	    }

	    /** @return user ID */
	    public int getUserId() {
	        return userId;
	    }

	    /** @return username */
	    public String getUsername() {
	        return username;
	    }

	    /** @return password */
	    public String getPassword() {
	        return password;
	    }

	    /** @param password new password */
	    public void setPassword(String password) {
	        this.password = password;
	    }
	
}
