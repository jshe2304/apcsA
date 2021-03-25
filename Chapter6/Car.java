package Chapter6;

public class Car {

    String typeL;
    String modelL;
    String colorL;
    int speed;
    String engineL;

    // constructor
    public Car(String type, String model, String color, String engine) {
        this.typeL = type;
        this.modelL = model;
        this.colorL = color;
        this.engineL = engine;
    }


    
    public String getColor() {
        return colorL;
    }

    public void setColor(String color) {
        this.colorL = color;
    }

    public int getSpeed() {
        return speed;
    }
    
    public String getEngine() {
        return engineL;
    }

    // methods
    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    public String toString() {
        return("Hi I am car type "+ typeL +
        "\nMy Speed is "+ getSpeed()+
        "\nwith Color "+ getColor()+ "\nwith "
        + getEngine() + " engine" + 
        "\nWith Increases speed "+ this.speed);
    }
}