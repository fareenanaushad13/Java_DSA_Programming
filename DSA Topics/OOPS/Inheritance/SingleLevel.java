//when a class inherits another class is called single level Inheritance

class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow");
    }
}

class SingleLevel {
    public static void main(String args[]) {
        Cat c = new Cat(); 
        c.eat();  // Inherited method from Animal
        c.meow(); // Method from Cat class
    }
}