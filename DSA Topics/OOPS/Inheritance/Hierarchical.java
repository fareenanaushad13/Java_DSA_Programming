// When two or more classes inherit a single class, it is called Hierarchical Inheritance

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breathing");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walking");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swimming");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("flying");
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        Birds b = new Birds(); 
        b.fly();  // Birds method
        b.eat();  // Inherited from Animal

        Fish f = new Fish();
        f.swim(); // Fish method
        f.eat();  // Inherited from Animal
    }
}
