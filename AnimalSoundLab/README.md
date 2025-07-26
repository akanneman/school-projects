# AnimalSoundLab

This Java project demonstrates **object-oriented programming (OOP)** concepts using inheritance and polymorphism.

## Concepts Demonstrated

- **Inheritance**: `Dog` and `Cat` extend the `Animal` base class
- **Method Overriding**: Each subclass overrides `makeSound()`
- **Polymorphism**: ArrayList of `Animal` types holds multiple subclasses
- **Dynamic Dispatch**: Each object’s version of `makeSound()` is called at runtime

## Project Structure

AnimalSoundLab/
├── src/
│ ├── Animal.java # Base class
│ ├── Dog.java # Subclass: Dog
│ ├── Cat.java # Subclass: Cat
│ └── Main.java # Runs all classes
├── AnimalSoundLab.iml
├── .gitignore
└── README.md

## Example Output

Dog barks
Cat meows
Dog barks
Cat meows

## How to Compile & Run

1. Open terminal/command prompt
2. Navigate to the `AnimalSoundLab` directory
3. Run:

```bash
javac src/*.java
java src.Main

This is part of my Java OOP practice series

Focused on clean code and core OOP principles
