package Chapter11;


public class AirplaneDriver {
    public static void main(String[] args) {
        Airbus plane1 = new Airbus("Joe", "Engine1", 200, 123, "United");
        Boeing plane2 = new Boeing("Mike", "Engine2", 300, 747, "JetBlue");
        
        Mirage plane3 = new Mirage("Phil", "Engine3", "USA", "Blue", "Fighter");
        Rafale plane4 = new Rafale("Bob", "Engine4", "UK", "Red", "Travel");

        System.out.println(plane1);
        System.out.println(plane2);
        System.out.println(plane3);
        System.out.println(plane4);
    }
}