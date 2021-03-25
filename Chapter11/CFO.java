package Chapter11;

public class CFO extends Executive {
    private double saleCom;
    
    public CFO (String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        
    }
    
    public void addSales(double sales) {
        saleCom = sales;
    }
}