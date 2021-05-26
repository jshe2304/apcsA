package Final;

/*
 * Represents an Item classified as Misc (Miscellaneous).
 * 
 * Contains the additonal value of Department.
 */

public class Misc extends Item{
    
    public String department;
    
    public Misc (String name, int id, Location location, double price, int quantity, String department) {
        super(name, id, location, price, quantity);
        this.department = department;
    }
    
    /*
     * Returns the additonal child class values.
     */
    
    public String getDepartment() {
        return department;
    }
    
    /*
     * The additional child class values must be added to the String return functions.
     */
    
    public String adminString() {
        String result = super.adminString();
        result += "Department : " + department + "\n";
        return result;
    }
    
    public String toString() {
        String result = super.toString();
        result += "Department : " + department + "\n";
        return result;
    }
}
