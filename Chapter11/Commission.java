package Chapter11;

public class Commission extends Hourly {
    private double totalSales;
    private double comRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socsecNumber, double rate, double comRate) {
        super (eName, eAddress, ePhone, socsecNumber, rate);
        this.comRate = comRate;
    }
    
    public double payCom () {
        double payment = totalSales * comRate;
        return payment;
    }
    
    public void addSales (double sales) {
        totalSales += sales;
    }
    
    public double pay() {
        double payment = super.pay() + (totalSales * comRate);
        return payment;
    }
    
    public String toString() {
        String result = super.toString();;
        result += "\nTotal Sales : " + totalSales;
        result += "\nCommission Rate : " + comRate;
        result += "\nTotal Commission : " + payCom();
        result += "\nTotal Hours + Commission : " + pay();
        result += super.pay();
        return result;
    }
}