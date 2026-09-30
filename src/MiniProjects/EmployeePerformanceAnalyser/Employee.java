package MiniProjects.EmployeePerformanceAnalyser;

public class Employee {
    private String name;
    private int salary;
    private int employeeScore;

    public Employee(String name, int salary, int employeeScore) {
        this.name = name;
        this.salary = salary;
        this.employeeScore = employeeScore;
    }

    public int getEmployeeScore(){
        return employeeScore;
    }

    public int getSalary(){
        return salary;
    }
}
