package Chapter10;

public class Contact_List {
    private String first, last, telephone;
    private int zip;
    
    public Contact_List (String first, String last, String telephone, int zip) {
        this.first = first;
        this.last = last;
        this.telephone = telephone;
        this.zip=zip;
    }
    
    public String toString () {
        //return zip +" " +last + " "+first + "\t" + telephone;
        return first + " " + last + "\t" + zip + "\t" + telephone;
    }
}