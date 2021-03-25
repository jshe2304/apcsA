package Chapter8;

public class SolveTowers
{
   //-----------------------------------------------------------------
   //  Creates a TowersOfHanoi puzzle and solves it.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      TowersOfHanoi towers = new TowersOfHanoi (3);

      towers.solve();
   }
}