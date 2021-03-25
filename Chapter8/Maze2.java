package Chapter8;

public class Maze2 {
//-----------------------------------------------------------------
// Creates a new maze, prints its original form, attempts to
// solve it, and prints out its final form.
//-----------------------------------------------------------------
    public static void main (String[] args) {
        Maze labyrinth = new Maze();

        System.out.println (labyrinth);

        System.out.println("\nTraversal path [row],[column]");

        if (labyrinth.traverseMaze (0, 0)) {
            System.out.println ("The maze was successfully traversed!");
        } else {
            System.out.println ("There is no possible path.");
            System.out.println (labyrinth);
        }
        System.out.println(labyrinth.grid);
    }
}