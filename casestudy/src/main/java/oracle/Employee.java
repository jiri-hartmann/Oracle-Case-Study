package oracle;

public class Employee {
    private static int lastIdentificationNumber = 0;

    private int identificationNumber;
    private String name;
    private double salary;

    private Employee(){
    }

    public Employee(String name, double salary) {
        this.identificationNumber = lastIdentificationNumber;
        lastIdentificationNumber++;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return identificationNumber + " " + name + " " + salary;
    }

    public void printEmployee(){
        if (this != null){
            System.out.println("Employee: " + this.toString());
        } else {
            System.out.println("No Employee");
        }

    }

    //Getters and Setters
    public int getIdentificationNumber() {
        return identificationNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
            return salary;
    }
    public void setSalary(double salary) {
            this.salary = salary;
    }
    
}
