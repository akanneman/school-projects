// Superclass representing a generic animal
public class Animal {
    // Protected name variable so subclasses can access it
    protected String name;

    // Constructor to initialize the animal's name
    public Animal(String name) {
        this.name = name;
    }

    // Method that can be overridden by subclasses to make a sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


