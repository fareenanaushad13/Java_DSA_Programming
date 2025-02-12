//Define a class
class Car{
    //Attributes
    String brand;
    int speed;

    // constructor
    Car(String brand , int speed){
        this.brand = brand;
        this.speed = speed;
    }
    //Method to display car details
    void displayCarInfo(){
        System.out.println("Brand:"+ brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
//Main class
public class CarDemo{
    public static void main(String args[]){
        //creating objects for class
        Car car1 = new Car("Lamborghini",356);
        Car car2 = new Car("Bugatti",490); 
        Car car3 = new Car("Ferrari",352);
     
        // Calling method to display information
        car1.displayCarInfo();
        System.out.println();
        car2.displayCarInfo();
        System.out.println();
        car3.displayCarInfo();
    }
}