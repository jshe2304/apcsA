package Chapter10;

public class CD {
    private String title, artist;
    private double cost;
    private int tracks;
//-----------------------------------------------------------------
// Creates a new CD with the specified information.
//-----------------------------------------------------------------
    public CD (String name, String singer, double price, int numTracks) {
        title = name;
        artist = singer;
        cost = price;
        tracks = numTracks;
    }
//-----------------------------------------------------------------
// Returns a description of this CD.
//-----------------------------------------------------------------
    public String toString() {
        String description;

        description = (cost) + "\t" + tracks + "\t";
        description += title + "\t" + artist;

        return description;
    }
}