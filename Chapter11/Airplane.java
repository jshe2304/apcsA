package Chapter11;

public abstract class Airplane {
    public String name;
    public String engine;
    
    public Airplane(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEngine() {
        return engine;
    }
    
    public String toString() {
        String result;

        result = "\n----------\nName : " + name;
        result += "\nEngine : " + engine;

        return result;
    }
}