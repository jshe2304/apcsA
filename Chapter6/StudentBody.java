package Chapter6;

public class StudentBody {
    public static void main(String[] args) {
        String first = "John";
        String last = "Doe";
        Address home = new Address("1st Street", "LA", "CA", 12345);
        Address school = new Address("Hawthorne", "RHE", "CA", 12345);
        Sport sport = new Sport("Track");
        Tests tests = new Tests(100, 90, 80);
        Student John = new Student(first, last, home, school, sport, tests);

        System.out.println(John.toString());
    }
}
