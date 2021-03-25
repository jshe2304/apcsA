package Chapter10;

public class Tunes {
//-----------------------------------------------------------------
// Creates a CDCollection object and adds some CDs to it. Prints
// reports on the status of the collection.
//-----------------------------------------------------------------
    public static void main (String[] args) {
        CDCollection music = new CDCollection ();

        int[] cutoff = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        double array_avrg = music.ArrayAvg(cutoff,10);
        System.out.println(array_avrg);
        System.out.println("\n\n\n");


        music.addCD ("By the Way", "Red Hot Chili Peppers", 14.95, 10);
        music.addCD ("Come On Over", "Shania Twain", 14.95, 16);
        music.addCD ("Soundtrack", "The Producers", 17.95, 33);
        music.addCD ("Play", "Jennifer Lopez", 13.90, 11);

        System.out.println (music);

        music.addCD ("Double Live", "Garth Brooks", 19.99, 26);
        music.addCD ("Greatest Hits", "Stone Temple Pilots", 15.95, 13);
        music.addCD ("Greatest Hits of 80's", "Stone Temple Pilots", 5.95, 3);

        System.out.println (music);
    }
}