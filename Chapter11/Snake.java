package Chapter11;

public class Snake extends Pet {
    private int length;

    public Snake(String snakeName, int snakeLength) {
        super(snakeName);
        length = snakeLength;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return super.toString() + " is a snake, " + length + " inches long";
    }

    public String speak() {
        return "hiss";
    }

    public String move() {
        return "slither";
    }
    
    public String eat() {
        return "eats bug";
    }
}