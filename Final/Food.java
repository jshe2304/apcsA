package Final;

public class Food extends Item{
    private boolean organic;
    private boolean adult;
    private double origPrice;
    
    public Food(String name, int id, Location location, double price, int quantity, boolean organic, boolean adult) {
        super(name, id, location, price, quantity);
        this.organic = organic;
        this.adult = adult;
        origPrice = price;
        if (organic) {
            changePrice(price * 1.2);
        }
    }
    
    public String getType () {
        return "food";
    }
    
    public boolean getOrganic() {
        return organic;
    }
    
    public boolean getAdult() {
        return adult;
    }
    
    public String adminString () {
        String result = super.adminString();
        
        if (organic) {
            result += "Organic ($" + String.format("%.3g", origPrice) + " + 20%)\n";
        }
        
        if (adult) {
            result += "Must be 21 or older to buy\n";
        }
        
        return result;
    }
    
    public String toString () {
        String result = super.toString();
        if (organic) {
            result += "Organic ($" + String.format("%.3g", origPrice) + " + 20%)\n";
        }
        
        if (adult) {
            result += "Must be 21 or older to buy\n";
        }  
        
        return result;
    }
}
