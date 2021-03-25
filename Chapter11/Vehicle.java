package Chapter11;

public abstract class Vehicle {
    
    public String brand;
    public String VIN;
    public int age;
    public int weight;
    
    public Vehicle (String brand, String VIN, int age, int weight) {
        this.brand = brand;
        this.VIN = VIN;
        this.age = age;
        this.weight = weight;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getVIN() {
        return VIN;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public abstract double tax();
    
    public String toString() {
        String result = "";
        result += "\n--------------------";
        result += "\nBrand : " + brand;
        result += "\nVIN : " + VIN;
        result += "\nAge : " + age;
        result += "\nWeight : " + weight;
        return result;
    }
}