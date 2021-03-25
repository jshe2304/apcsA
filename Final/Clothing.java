package Final;

public class Clothing extends Item {
    
    private String gender;
    private String size;
    
    public Clothing(String name, int id, Location location, double price, int quantity, String gender, String size) {
        super(name, id, location, price, quantity);
        this.gender = gender;
        this.size = size;
    }
    
    public String getType() {
        return "clothing";
    }
    
    public String getGender () {
        return gender;
    }
    
    public String getSize () {
        return size;
    }
    
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
