package Chapter6;

import java.util.*;

public class Puppy2 {
    static Scanner scan = new Scanner(System.in);
    // Instance Variables
    String DogName;
    String DogBreed;
    int DogAge;
    String DogColor;
    int DogWeight;

    // String name;
    // String breed;
    // int age;
    // String color;

    // Constructor Declaration of Class
    public Puppy2(String name, String breed,int age, String color) {
        DogName = name;
        DogBreed = breed;
        DogAge = age;
        DogColor = color;

        // this.name = name;
        // this.breed = breed;
        // this.age = age;
        // this.color = color;

    }
    public Puppy2(String name, String breed) {
        DogName = name;
        DogBreed = breed;

    }

    public Puppy2() {


    }

    // method 1
    public String getName() {
        return DogName;
    }

    // method 2
    public String getBreed() {
        return DogBreed;
    }

    // method 3
    public int getAge() {
        return DogAge;
    }

    // method 4
    public String getColor() {
        return DogColor;
    }
    
    public int getWeight() {
        System.out.println("Enter the weight");
        DogWeight = scan.nextInt();
        return DogWeight;
    }


    public String toString() {
        return("Hi my name is "+ this.getName()+
                ".\nMy breed, age, color, and weight are " +
                this.getBreed()+", " + this.getAge()+
                ", "+ this.getColor()) + ", " + this.getWeight();
    }

    public static void main(String[] args) {
        Puppy2 tuffy = new Puppy2("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}