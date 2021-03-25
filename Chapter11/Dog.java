package Chapter11;

public class Dog extends Pet {
    private int weight;

    public Dog(String dogName, int dogWeight) {
        super(dogName);
        weight = dogWeight;
    }

    public int getWeight() {
        return weight;
    }
    
    public String toString() {
        return super.toString() + " is a dog, weighing " + weight + " pounds";
    }

    public String speak() {
        return "woof";
    }

    public String move() {
        return "run";
    }

    public String eat() {
        return "eats dog food";
    }
}