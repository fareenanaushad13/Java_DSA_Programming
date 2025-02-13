//Absraction: Hiding all the unnecessary details and showing only the important parts to the user
//Abstract Class: It is a  class that cannot be instantiated and may contain abstract methods (methods without a body). It is used as a blueprint for other classes to inherit and implement the abstract methods.
public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal {
    void eat(){
        System.out.println("animals eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
