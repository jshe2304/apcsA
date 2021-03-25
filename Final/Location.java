package Final;

public class Location {
    
    public int floor;
    public int row;
    
    public Location (int floor, int row) {
        this.floor = floor;
        this.row = row;
    }
    
    public int floor () {
        return floor;
    }
    
    public int row () {
        return row;
    }
    
    public void changeFloor (int newFloor) {
        floor = newFloor;
    }
    
    public void changeRow (int newRow) {
        row = newRow;
    }
    
    public String toString () {
        String result = "Location: ";
        result += "Floor " + floor + ", ";
        result += "Row " + row + "\n";
        return result;
    }
}
