package Optional.miniProject;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private String department;
    private Optional<String> email;


    public Employee(String name, Optional<String> email, int age, int salary, String department) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public Optional<String> getEmail() {
        return email;
    }
}
