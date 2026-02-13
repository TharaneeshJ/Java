package BuggyCodes;
public class buggycode {
    public static void main(String[] args) {

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        if (isLoggedIn = true && isAdmin == true) {  // Bug: Using assignment operator instead of equality operator 
        // (if(isLoggedIn && isAdmin))
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
