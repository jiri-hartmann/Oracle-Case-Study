package oracle;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HR App Starts");

        Department dep = new Department("Finance");
        System.out.println("Department: " + dep.toString());
        
        Employee emp1 = new Employee ("Jiri", 50000);
        Employee emp2 = new Employee ("Jan", 75000);
        Employee emp3 = new Employee ("Pepa", 100000);

        dep.addEmployeeToDepartment(emp1);
        dep.addEmployeeToDepartment(emp2);
        dep.addEmployeeToDepartment(emp3);

        dep.employeeByIdentificationNumber(1).printEmployee();

        dep.printEmployeesInDepartment();

        System.out.println("Total salary: " + dep.getSalaryInDepartment());

        System.out.println("Average: " + dep.getAverageSalaryInDepartment());


    }
}