package Chapter11;

public class Boeing extends Commercial{
    public int model;
    public String brand;
    public String manufacturer = "Boeing";
    
    public Boeing(String name, String engine, int seats, int model, String brand) {
        super (name, engine, seats);
        this.model = model;
        this.brand = brand;
    }
    
    public int getModel () {
        return model;
    }
    
    public String getBrand () {
        return brand;
    }
    
    public String getManufacturer () {
        return manufacturer;
    }

    public String toString () {
        String result = super.toString();
        
        result += "\nModel : " + manufacturer + " " + model + "\nBrand : " + brand;
        return result;
    }
}
