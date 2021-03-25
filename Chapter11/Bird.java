package Chapter11;

public class Bird extends Pet {
    private int weight;
    
    public Bird(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    
    public String toString() {
        return super.toString() + " is a bird, weighing " + weight + " pounds";
    }

    public String speak() {
        return "chirp";
    }

    public String move() {
        return "fly";
    }

    public String eat() {
        return "eats seeds";
    }
}
