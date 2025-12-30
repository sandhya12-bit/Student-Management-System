package auth;

public class AuthService {
    private UserDAO userDAO;

    public AuthService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    // Authenticate user
    public boolean authenticate(String username, String password) {
        User user = userDAO.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    // Change password
    public boolean changePassword(int userId, String oldPassword, String newPassword) {
        User user = userDAO.findByUsername(getUsernameById(userId));
        if (user != null && user.getPassword().equals(oldPassword)) {
            return userDAO.updatePassword(userId, newPassword);
        }
        return false;
    }

    // Helper method (simple approach)
    private String getUsernameById(int userId) {
        // In real projects, create findById()
        return null;
    }
}
