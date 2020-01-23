/* 3.13 (Employee Class) 
Create a class called Employee that includes three instance variables
—a first name (type String), a last name (type String) and a monthly salary (double). 
Provide a con- structor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value.
Write a test app named Employ- eeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again. */

// Ex3.13
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String first, String last, double salary) {
        this.firstName = first;
        this.lastName = last;
        if (salary > 0)
            this.monthlySalary = salary;
    }

    public void set_firstName(String first) {
        firstName = first;
    }

    public String get_firstName() {
        return firstName;
    }

    public void set_lastName(String last) {
        lastName = last;
    }

    public String get_lastName() {
        return lastName;
    }

    public void set_salary(double salary) {
        monthlySalary = salary;
    }

    public double get_salary() {
        return monthlySalary;

    }

    public double raisedSalary() {
        double yearlySalary =  12 * monthlySalary;
        return yearlySalary + (yearlySalary * 0.1);
    }

    
}