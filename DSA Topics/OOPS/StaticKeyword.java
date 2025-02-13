// Static Variables: Shared among all objects of a class.
// Static Methods: Can be called without creating an object.
// Static Blocks: Runs once when the class is loaded.
// Static Nested Classes: Inner classes that do not need an outer class instance.

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "LLRSS";

        Student s2 = new Student();
        System.out.println(s2.schoolName); 

        Student s3 = new Student();
        s3.schoolName = "DAV";

        // Printing after changing static variable
        System.out.println(s1.schoolName);  
        System.out.println(s2.schoolName);  
    }
}

class Student {
    String name;
    int roll;

    static String schoolName; 

    void setName(String name) {
        this.name = name;  
    }

    String getName() {
        return this.name;  
    }
}
