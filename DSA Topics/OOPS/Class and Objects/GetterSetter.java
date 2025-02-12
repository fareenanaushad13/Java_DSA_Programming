// Employee class with private fields
class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        setSalary(salary); 
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for salary (with validation)
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}

// Main class
public class GetterSetter {
    public static void main(String[] args) {
        // Creating Employee objects using the constructor
        Employee emp1 = new Employee("Far", 361, 361000);
        Employee emp2 = new Employee("Farru", 316, 316000);
        Employee emp3 = new Employee("Fari", 163, 163000);

        // Displaying employee details
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
    }
}
