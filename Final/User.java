package Final;

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
    
    public String getName () {
        return name;
    }
    
    public boolean comparePassword(String inputPassword) {
        if (this.password.equals(inputPassword)) {
            return true;
        }
        return false;
    } 
    
    public boolean isAdmin () {
        return admin;
    }
    
    public boolean isAdult () {
        return adult;
    }
    
    private boolean hasCard () {
        if (creditCard > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean hasAddress () {
        if (address.length() > 1) {
            return true;
        } else {
            return false;
        }
    }
    
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
