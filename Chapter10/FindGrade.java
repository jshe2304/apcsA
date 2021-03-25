package Chapter10;

public class FindGrade {

    public static void main (String[] args) {
        int[] grades = {60, 68, 70, 72, 73, 77,77, 85, 86, 89, 93, 95, 98};

        int lookFor = 770;
        int pos = Searches.linearSearch (grades, lookFor);

        if (pos != -1) {
            System.out.println ("The grade " + lookFor + " was found at "+ "position " + pos);
        } else {
            System.out.println ("The grade " + lookFor + " was not found");
        }

        lookFor =70;
        pos = Searches.binarySearch (grades, lookFor);

        if (pos != -1) {
            System.out.println ("The grade " + lookFor + " was found at " + "position " + pos);
        } else {
            System.out.println ("The grade " + lookFor + " was not found");
        }
    }
}