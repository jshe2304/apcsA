package Final;

/*
 * Represents a User account needed to use the Inventory.
 * 
 * Has 6 basic values.
 * Credit Card number (creditCard), Address, and Password cannot be returned for security reasons, but can be check to see if they exist.
 */

public class User {
    public String name;
    public boolean admin;
    public boolean adult;
    private int creditCard;
    private String password;
    private String address;
    
    public User (String name, boolean admin, boolean adult, int creditCard, String address, String password) {
        this.name = name;
        this.admin = admin;
        this.adult = adult;
        this.creditCard = creditCard;
        this.address = address;
        this.password = password;
    }
    
    /*
     * The following functions return the accessible values.
     */
    
    public String getName () {
        return name;
    }
    
    public boolean isAdmin () {
        return admin;
    }
    
    public boolean isAdult () {
        return adult;
    }
    
    /*
     * This function can compare a password to see if it matches the User's password. 
     * 
     * Used in the login process
     */
    
    public boolean comparePassword(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            return true;
        }
        return false;
    }
    
    /*
     * Ensures whether or not the User has a credit card in the system.
     */
    
    private boolean hasCard () {
        if (creditCard > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * Ensures the User has an address to use.
     */
    
    private boolean hasAddress () {
        if (address.length() > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * Returns the User's information.
     * 
     * Some fields are hidden.
     * 
     * Accessible from the Inventory GUI.
     */
    
    public String toString () {
        String result = "";
        result += name + "\n";
        result += "Admin: " + admin + "\n";
        result += "Adult: " + adult + "\n";
        result += "Credit Card: **** **** **** ****\n";
        result += "Address: " + address + "\n";
        return result;
    }
}
