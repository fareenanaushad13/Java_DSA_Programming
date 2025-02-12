//Encapsulation is defined as the wrapping up of data and methods under a single unit, It also implements data hiding

public class Test {  
    private String name;  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student {  
    public static void main(String args[]) {
        
        Test s1 = new Test();
        Test s2 = new Test();

        // Setting values using setter methods
        s1.setName("Far");
        s2.setName("Farru");

        // Getting and printing values using getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Name: " + s2.getName());
    }
}
