//When there is a chain of inheritance is called multilevel inheritance

class Animal {
    String color;
    
    void eat() {
        System.out.println("eats");
    }
}

// Mammal extends Animal (First level of inheritance)
class Mammal extends Animal {
    int legs;
}

// Cat extends Mammal (Second level of inheritance)
class Cat extends Mammal {
    String breed;
}

public class MultiLevel {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.eat();  // Inherited from Animal
        c.legs = 4; // Inherited from Mammal
        System.out.println("Legs: " + c.legs);
    }
}