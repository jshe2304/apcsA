package Chapter6;

public class Student {
    
    private String first, last;
    private Address home, school;
    private Sport sport;
    private Tests tests;

    public Student (String first, String last, Address home, Address school, Sport sport, Tests tests) {
        
        this.first =first;
        this.last = last;
        this.home = home;
        this.school = school;
        this.sport = sport;
        this.tests = tests;
    
    }

    public Student (String first, String last ) {
        
        this.first = first;
        this.last = last;

    }

    public String toString() {
        String result;
        result = first + " ";
        result += last + "\n" ;
        result += "Home Address: " + home + "\n";
        result += "School Address: " + school + "\n";
        result += "Sport : " + sport + "\n";
        result += tests;
        return result;
    }
}