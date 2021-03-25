package Chapter11;

public class Rafale extends Military{
    public String color;
    public String job;
    public String model = "Rafale";
    
    public Rafale (String name, String engine, String military, String color, String job) {
        super(name, engine, military);
        this.color = color;
        this.job = job;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getJob() {
        return job;
    }
    
    public String getModel() {
        return model;
    }
    
    public String toString() {
        String result = super.toString();
        result += "\nModel : " + model;
        result += "\nColor : " + color;
        result += "\nJob : " + job;

        return result;
    }
}
