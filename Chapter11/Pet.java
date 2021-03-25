package Chapter11;

public abstract class Pet {
    private String name;

    public Pet(String petName) {
        name = petName;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "pet " + name;
    }

    abstract public String speak();

    abstract public String move();
    
    abstract public String eat();
}