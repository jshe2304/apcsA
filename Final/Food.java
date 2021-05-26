package Final;

/*
 * Represents a Item classified as a Food.
 * 
 * Contains additional values of Organic, which marks up the price by 20% and Adult, which restricts purchase by age.
 * 
 * The double origPrice below is equal to the original price inputted when the item is created. 
 * If the Food Item is organic, the origPrice is displayed to inform the User of the markup
 */

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
    
    public String getName() {
        if (organic) {
            return "Organic " + super.getName().substring(0, 1).toUpperCase() + super.getName().substring(1);
        } else {
            return super.getName();
        }
    }
    
    /*
     * The following functions return the additonal child class values.
     */
    
    public double getOrigPrice() {
        return origPrice;
    }
    
    public boolean getOrganic() {
        return organic;
    }
    
    public boolean isAdult() {
        return adult;
    }
    
    /*
     * The additional child class values must be added to the String return functions.
     */
    
    public String adminString () {
        String result = super.adminString();
        
        if (organic) {
            result += "Organic ($" + Math.floor(origPrice * 100)/100 + " + 20%)\n";
        }
        
        if (adult) {
            result += "Must be 21 or older to buy\n";
        }
        
        return result;
    }
    
    public String toString () {
        String result = super.toString();
        if (organic) {
            result += "Organic ($" + Math.floor(origPrice * 100)/100 + " + 20%)\n";
        }
        
        if (adult) {
            result += "Must be 21 or older to buy\n";
        }  
        
        return result;
    }
}
