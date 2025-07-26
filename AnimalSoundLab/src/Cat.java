// Cat is a subclass of Animal
public class Cat extends Animal {

    // Constructor calls the superclass constructor with the cat's name
    public Cat(String name) {
        super(name);
    }

    // Overrides the makeSound method to provide a specific sound for Cat
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
