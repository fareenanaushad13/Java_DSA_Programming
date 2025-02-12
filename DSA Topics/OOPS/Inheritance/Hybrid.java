// Hybrid inheritance is the combination of Single and Multiple inheritance

// Single inheritance: Child extends HumanBody
class HumanBody {
    public void displayHuman() {
        System.out.println("Methods defined inside HumanBody class");
    }
}

// Interfaces for Multiple Inheritance
interface Male {
    void show();
}

interface Female {
    void show(); 
}

// Child class extending HumanBody (Single Inheritance) and implementing Male & Female (Multiple Inheritance)
public class Child extends HumanBody implements Male, Female {
    public void show() {
        System.out.println("Implementation of show() method defined in interfaces Male and Female");
    }

    public void displayChild() {
        System.out.println("Methods defined inside Child class");
    }
}

class Hybrid {
    public static void main(String args[]) {
        Child obj = new Child();
        System.out.println("Implementations of Hybrid Inheritance:");
        obj.show();         // Calls show() method from Male & Female interfaces
        obj.displayChild(); // Calls method from Child class
        obj.displayHuman(); // Calls method from HumanBody class (Single Inheritance)
    }
}
