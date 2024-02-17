package oracle;

public class Department {
    private String name;
    private Employee[] employees = new Employee[10];
    private int lastEmployee;

    public Department(String name) {
        this.name = name;
        lastEmployee = 0;
        for (int i=0; i < employees.length; i++){
            employees[i] = null;    
        }
    }

    public void addEmployeeToDepartment(Employee employee) {
        if (lastEmployee < employees.length) {
            employees[lastEmployee] = employee;
            lastEmployee++;
        } else {
            System.out.println("You exceed maximum numbe of employees in department " + employees.length);
        }
    }
    @Override
    public String toString(){
        return name;
    }

    public Employee[] getEmployeesInDepartment() {
        if (lastEmployee == 0) {
            return null;
        } else {
            Employee[] employeesInDepartment = new Employee[lastEmployee];
            for (int i = 0; i < lastEmployee; i++) {
                employeesInDepartment[i] = employees[i];
            }
            return employeesInDepartment;
        }
    }


    public void printEmployeesInDepartment() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                employees[i].printEmployee();
            }
        } 
    }

    public int numberOfEmployees() {
        return lastEmployee;
    }

    public Employee employeeByIdentificationNumber(int identificationNumber) {
        if (lastEmployee == 0){
            return null;
        }
        for (Employee employee : employees) {
            if (employee.getIdentificationNumber() == identificationNumber) {
                return employee;
            }
        }
        return null;
    }

    public double getSalaryInDepartment() {
        double allSalary = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            allSalary += employee.getSalary();
        }
        return allSalary;
    }

    public double getAverageSalaryInDepartment() {
        if (lastEmployee != 0) {
            return getSalaryInDepartment() / lastEmployee;
        }
        return 0;
    }
}
