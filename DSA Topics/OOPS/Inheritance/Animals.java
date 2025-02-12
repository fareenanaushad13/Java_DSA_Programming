//Inheritance is when properties and methosds of the base class(parent class) are passed on to a derived class(Child class)
public class Animals{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
   
}
//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swiming in water");
    }
}