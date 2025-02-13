//super keyword is used to refer immediate parent class object
public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}
class Animal{
    Animal(){
        System.out.println("animal constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor called");
    }
}
