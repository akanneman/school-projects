import java.util.ArrayList;

// This class demonstrates inheritance, method overriding, and polymorphism
public class Main {
    public static void main(String[] args) {
        // Create individual Dog and Cat objects
        Dog buddy = new Dog("Buddy");
        Cat whiskers = new Cat("Whiskers");

        // Demonstrate method overriding by calling makeSound() directly
        buddy.makeSound();       // Output: Dog barks
        whiskers.makeSound();    // Output: Cat meows

        // Create an ArrayList of Animal objects to demonstrate polymorphism
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(buddy);       // Add Dog object
        animals.add(whiskers);    // Add Cat object

        // Loop through each Animal and call makeSound()
        // This shows that the correct subclass method is called at runtime
        for (Animal animal : animals) {
            animal.makeSound();   // Output: Dog barks, Cat meows
        }
    }
}