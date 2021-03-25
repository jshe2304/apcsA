package Chapter6;

public class Car_Driver {

    public static void main(String[] args) {

        Car focus = new Car("Ford", "Focus", "red", "6-Cylinder");
        Car auris = new Car("Toyota", "Auris", "blue", "6-Cylinder");
        Car golf = new Car("Volkswagen", "Golf", "green", "6-Cylinder");

        focus.increaseSpeed(10);
        auris.increaseSpeed(20);
        golf.increaseSpeed(30);

        System.out.println(focus );
        System.out.println(auris );
        System.out.println(golf );

    }
}