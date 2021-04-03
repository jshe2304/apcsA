package Final;

public class Misc extends Item{
    
    public String department;
    
    public Misc (String name, int id, Location location, double price, int quantity, String department) {
        super(name, id, location, price, quantity);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
    
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
