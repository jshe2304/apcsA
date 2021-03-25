package Chapter6;

public class Puppy {
    int puppyAge;
    int puppyWeight;

    public Puppy(String name) {
        System.out.println("Name chosen is :" + name ); // This constructor has one parameter, name.
    }

    public void setAge( int age ) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }
    
    public double getWeight(int weight) { 
        System.out.println("Puppy's weight is : " + weight);
        return weight;
    }

    public static void main(String []args) {
        //Scanner scan = new Scanner(System.in);
        Puppy myPuppy = new Puppy( "tommy" ); /* Object creation */

        myPuppy.setAge( 2 ); /* Call class method to set puppy's age */
        myPuppy.getAge( );
        myPuppy.getWeight(10);
        System.out.println("Variable Value :" + myPuppy.puppyAge ); /* You can access instance variable as follows as well */
    }
}