package Chapter11;

public class FarmTruck extends Truck {
    
    public String crop;
    
    public FarmTruck (String brand, String VIN, int age, int weight, int capacity, String type, String crop) {
        super(brand, VIN, age, weight, capacity, type);
        
        this.crop = crop;
    }
    
    public String getCrop() {
        return crop;
    }
    
    public double tax() {
        double tax = 0;
        if (age < 3) {
            tax += 400;
        } else {
            tax += 100;
        }
        
        if (weight > 12500) {
            tax *= 1.15;
        }

        return tax;
    }

    public String toString() {
        String result = super.toString();
        result += "\nCrop : " + crop;
        return result;
    }
}
