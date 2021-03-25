package Chapter6;

public class Address2 {
    private String streetAddress, city, state;
    private int zipCode;

//-----------------------------------------------------------------
// Sets up this Address object with the specified data.
//-----------------------------------------------------------------
    public Address2 (String street, String town, String st, int zip) {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

//-----------------------------------------------------------------
// Returns this Address object as a string.
//-----------------------------------------------------------------
    public String toString() {
        String result;

        result = streetAddress;
        result += ", " + city + ", " + state + " " + zipCode;

        return result;
    }
}