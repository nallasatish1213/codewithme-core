package testing.citi;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Length check
        if (password.length() <= 8 || password.length() >= 16) {
            return false;
        }

        // Regex: only letters and digits
        return password.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {
        String[] testPasswords = {
            "short1",              // too short
            "longpassword123456",  // too long
            "validPass123",        // valid
            "bad$chars123",        // contains special character
            "NoSpecials123"        // valid
        };

        for (String pwd : testPasswords) {
            System.out.println("Password: " + pwd + " → " + (isValidPassword(pwd) ? "Valid" : "Invalid"));
        }
    }
}