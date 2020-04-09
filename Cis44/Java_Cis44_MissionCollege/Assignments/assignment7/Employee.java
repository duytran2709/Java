/**
 * Employee
 * /**
 * assignment7
 * Write a class called Employee that has a member variable called name of type String 
 * and a member variable called age of type integer. 
 * The class must be Comparable based on the employee age. 
 * The Employee class must have a toString method that returns a String containing the name and age. 
Create a LinkedBag of Employees. In the linkedBag class write a method that returns the oldest employee.

 */
public class Employee implements Comparable<Employee> 
{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        String st = "";
        st += "Employee name: " + name;
        st += "\n";
        st += "Employee age: " + age;
        return st;
    }

    public int compareTo (Employee a)
    {
        if (age > a.age)
            return 1;
        else if (age == a.age) return 0;
        else return -1;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (age == e.getAge() && name == e.getName() )
        {
            return true;
        } else return false;
    }
    
    
}