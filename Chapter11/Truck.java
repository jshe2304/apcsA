package Chapter11;

public class Truck extends Vehicle{
    public int capacity;
    public String type;

    public Truck (String brand, String VIN, int age, int weight, int capacity, String type) {
        super(brand, VIN, age, weight);

        this.capacity = capacity;
        this.type = type;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public String getType() {
        return type;
    }

    public double tax() {
        double tax = 0;
        if (age < 3) {
            tax += 400;
        } else {
            tax += 100;
        }
        
        if (weight > 12500) {
            tax *= 1.2;
        }
        
        return tax;
    }
    
    public String toString() {
        String result = super.toString();
        result += "\nVehicle Type : Truck";
        result += "\nCapacity : " + capacity;
        result += "\nTruck Type : " + type;
        result += "\nTax : $" + tax();
        return result;
    }
}