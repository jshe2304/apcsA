package Chapter8;

public class Redo {
    public static int redo(int i, int j) {
        if (i == 0) {
            return 0;
        } else {
            return redo(i/j, j) + 1;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(redo(82, 3));
    }
}
