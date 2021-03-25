package Chapter11;


public abstract class Commercial extends Airplane{
    public int seats;
    public String type = "Commercial";
    
    public Commercial (String name, String engine, int seats) {
        super (name, engine);
        this.seats = seats;
    }
    
    public int getSeats() {
        return seats;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        String result = super.toString();
        result += "\nType : " + type + "\nSeats : " + seats;
        return result;
    }
}
