package Final;

/*
 * Represents an Item classified as Clothing.
 * 
 * Contains the additional values of Gender and Size.
 */

public class Clothing extends Item {
    
    private String gender;
    private String size;
    
    public Clothing(String name, int id, Location location, double price, int quantity, String gender, String size) {
        super(name, id, location, price, quantity);
        this.gender = gender;
        this.size = size;
    }
    
    /*
     * Returns the additonal child class values.
     */
    
    public String getType() {
        return "clothing";
    }
    
    public String getGender () {
        return gender;
    }
    
    public String getSize () {
        return size;
    }
    
    /*
     * The additional child class values must be added to the String return functions.
     */
    
    public String adminString () {
        String result = super.adminString();
        result += "Gender : " + gender + "\n";
        result += "Size : " + size + "\n";
        return result;
    }
    
    public String toString () {
        String result = super.toString();
        result += "Gender : " + gender + "\n";
        result += "Size : " + size + "\n";
        return result;
    }
}
