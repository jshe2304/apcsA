package Chapter11;

public class Car extends Vehicle{
    public int seats;
    public String color;

    public Car (String brand, String VIN, int age, int weight, int seats, String color) {
        super(brand, VIN, age, weight);

        this.seats = seats;
        this.color = color;
    }
    
    public int getSeats() {
        return seats;
    }
    
    public String getColor() {
        return color;
    }

    public double tax() {
        double tax = 0;
        if (age < 3) {
            tax += 400;
        } else {
            tax += 100;
        }
        return tax;
    }
    
    public String toString() {
        String result = super.toString();
        result += "\nVehicle Type : Car";
        result += "\nSeats : " + seats;
        result += "\nColor : " + color;
        result += "\nTax : $" + tax();
        return result;
    }
}