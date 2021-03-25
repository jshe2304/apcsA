package Chapter11;


public abstract class Military extends Airplane{
    public int seats;
    public String military;
    public String type = "Fighter";
    
    public Military (String name, String engine, String military) {
        super (name, engine);
        this.seats = seats;
        this.military = military;
    }
    
    public String getMilitary() {
        return military;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        String result = super.toString();
        result += "\nType : " + type + "\nMilitary : " + military;
        return result;
    }
}
