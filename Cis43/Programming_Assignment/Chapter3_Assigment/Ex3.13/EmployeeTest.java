
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("duy", "tran", 2875);
        Employee employee2 = new Employee("trang", "dao", 3150.75);

        System.out.printf("%nName of employee1: %s , %s", employee1.get_firstName(), employee1.get_lastName());
        System.out.printf("%nYearly Salary of %s : $%.2f", employee1.get_firstName(), employee1.get_salary() * 12);
        System.out.printf("%nRaised Yearly-Salary of %s : $%.2f", employee1.get_firstName(), employee1.raisedSalary());
        

        System.out.printf("%nName of employee2: %s , %s", employee2.get_firstName(), employee2.get_lastName());
        System.out.printf("%nYearly Salary of %s : $%.2f", employee2.get_firstName(), employee2.get_salary() * 12);
        System.out.printf("%nRaised Yearly-Salary of %s : $%.2f", employee2.get_firstName(), employee2.raisedSalary());
        System.out.println();
    }

}