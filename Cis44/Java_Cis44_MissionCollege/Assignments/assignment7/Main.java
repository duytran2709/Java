/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        BagInterface<Employee> myCompanyL = new LinkedBagEmployee<>() ;

        Employee e1 = new Employee("Duy", 45);
        Employee e2 = new Employee("Sam", 18);
        Employee e3 = new Employee("David", 27);
        Employee e4 = new Employee("Nancy", 19);

        myCompanyL.add(e1);
        myCompanyL.add(e2);
        myCompanyL.add(e3);
        myCompanyL.add(e4);

        







    }

    
}