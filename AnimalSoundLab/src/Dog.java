// Dog is a subclass of Animal
public class Dog extends Animal {

    // Constructor calls the superclass constructor with the dog's name
    public Dog(String name) {
        super(name);
    }

    // Overrides the makeSound method to provide a specific sound for Dog
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
