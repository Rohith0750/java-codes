// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Runtimepoly {
    public static void main(String[] args) {
        Animal myAnimal;   // Parent class reference

        myAnimal = new Dog();
        myAnimal.makeSound();  // Calls Dog's version → Output: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound();  // Calls Cat's version → Output: Cat meows
    }
}
