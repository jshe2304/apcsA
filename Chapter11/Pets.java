package Chapter11;

public class Pets {
    public static void main (String[] args) {
        Dog fido = new Dog("Fido", 45);
        Snake sam = new Snake("Sam", 30);
        Bird bob = new Bird("Bob", 1);

        System.out.println(fido);
        System.out.println(fido.getName() + " says " + fido.speak());
        System.out.println(fido.move() + " " + fido.getName() + " " + fido.move());
        System.out.println(fido.getName() + " " + fido.eat());

        System.out.println();
        System.out.println(sam);
        System.out.println(sam.getName() + " says " + sam.speak());
        System.out.println(sam.move() + " " + sam.getName() + " " + sam.move());
        System.out.println(sam.getName() + " " + sam.eat());
        
        System.out.println();
        System.out.println(bob);
        System.out.println(bob.getName() + " says " + bob.speak());
        System.out.println(bob.move() + " " + bob.getName() + " " + bob.move());
        System.out.println(bob.getName() + " " + bob.eat());
}
}