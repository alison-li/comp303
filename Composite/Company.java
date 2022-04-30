/**
 * Composite Pattern Demo
 * Credit: https://www.geeksforgeeks.org/composite-design-pattern/
 */
public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer"); 
        CompanyDirectory engDirectory = new CompanyDirectory(); 
        engDirectory.addEmployee(dev1); 
        engDirectory.addEmployee(dev2); 
        engDirectory.showEmployeeDetails();

        System.out.println("\n");
           
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager"); 
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager"); 
        CompanyDirectory accDirectory = new CompanyDirectory(); 
        accDirectory.addEmployee(man1); 
        accDirectory.addEmployee(man2); 
        accDirectory.showEmployeeDetails();

        System.out.println("\n");
       
        CompanyDirectory mainDirectory = new CompanyDirectory(); 
        mainDirectory.addEmployee(engDirectory); 
        mainDirectory.addEmployee(accDirectory); 
        mainDirectory.showEmployeeDetails(); 
    }
}