package MiniProjects.MethodReferences.EmployeeManagementProgram;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Name : "+name+" Employee Salary : "+salary);
    }
    public static void staticMethod(){
        System.out.println("This is the static method");
    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
