package Streams.Employee;

import java.util.stream.Stream;

public class Employee {
    private String name;
    private String department;
    private int salary;
    private int age;
    private String city;

    public Employee(String name, String department, int salary, int age, String city) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + "'" +
                ", department='" + department + "'" +
                ", salary=" + salary +
                ", age=" + age +
                ", city='" + city + "'" +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
