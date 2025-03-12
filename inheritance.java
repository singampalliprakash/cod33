
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  

        Dog myDog = new Dog();
        myDog.makeSound(); 

        Animal myPet = new Dog();
        myPet.makeSound(); 
    }
}
