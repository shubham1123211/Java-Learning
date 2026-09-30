package Streams.Employee;

import Streams.StreamDemo;

import javax.swing.text.html.Option;
import javax.xml.transform.Result;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamDemoUsingEmployee {
    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Amit", "IT", 75000, 25, "Mumbai"),
                new Employee("Rahul", "HR", 55000, 30, "Pune"),
                new Employee("Priya", "IT", 90000, 28, "Mumbai"),
                new Employee("Sneha", "Finance", 65000, 32, "Delhi"),
                new Employee("Vikas", "IT", 45000, 24, "Pune"),
                new Employee("Neha", "HR", 70000, 27, "Mumbai"),
                new Employee("Rohan", "Finance", 85000, 35, "Delhi"),
                new Employee("Anjali", "IT", 60000, 29, "Bangalore"),
                new Employee("Karan", "Marketing", 50000, 26, "Pune"),
                new Employee("Meera", "IT", 110000, 31, "Mumbai")
        );

        //Employee whose salary is greater than 50000
//        Stream<Employee> stream1 = employees.stream()
//                .filter(employee -> employee.getSalary() > 50000);
//
//        stream1.forEach(System.out::println);

        //Create a steam only having employee name
//        Stream<String> employeeName = employees.stream()
//                .map(Employee::getName);
//        employeeName.forEach(System.out::println);

        //sorted salary lowest to highest :: NOT UNDERSTOOD
//        Stream<Employee> sortedStream1 = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary));
//        sortedStream1.forEach(System.out::println);

        //sorted salry highest to lowest :
//        Stream<Employee> sortedStream2 = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed());
//        sortedStream2.forEach(System.out::println);

        //Print all unique departments
//        Stream<String> allUnqDepart = employees.stream()
//                .map(Employee::getDepartment)
//                .distinct();
//        allUnqDepart.forEach(System.out::println);

        //Print 3 employee after sorting by salary
//        Stream<Employee> lowSalaryEmployee = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary))
//                .limit(3);
//        lowSalaryEmployee.forEach(System.out::println);

        // skip first 3 highest paid employee and print others (I cannot able to the revers sorting so this is not possible right now)

//        Stream<Employee> skip3HighestPaid = employees.stream()
//                .sorted(Comparator.comparing((Employee x) -> x.getSalary()).reversed())
//                .skip(3);
//        skip3HighestPaid.forEach(System.out::println);



        // PrintEvery Employee name -> I can direclty apply on list but still, I'm doing this because of stream
//        employees.stream().forEach(employee -> System.out.println(employee.getName()));

        //List of employees whose salary is more than 60k -> Confused of collect method - please explain me kai
//        List<String> employeeSalaryAbove60K = employees.stream()
//                .filter(employee -> employee.getSalary() > 60000)
//                .map(Employee::getName)
//                .toList();
//        employeeSalaryAbove60K.forEach(System.out::println);

        // Count Employee with IT Department
//        long count = employees.stream()
//                .map(Employee::getDepartment)
//                .filter(x -> x == "IT")
//                .count();
//        System.out.println(count);

        //Find Employee with lowest salary and highest salary
//        Optional<Employee> employeeWithLowSalary = employees.stream()
//                .min(Comparator.comparing(Employee::getSalary));
//        System.out.println(employeeWithLowSalary.get());

//        Optional<Employee> employeeWithHighSalary = employees.stream()
//                .max(Comparator.comparing(Employee::getSalary));
//        System.out.println(employeeWithHighSalary.get());

        //Find First employee with age greater than 30
//        Optional<Employee> firstEmployeeAgeMoreThan30 = employees.stream()
//                .filter(x -> x.getAge() > 30)
//                .findFirst();
//
//        System.out.println(firstEmployeeAgeMoreThan30.get());

        //Check whether any employee has a salary greater than 100,000.
//        boolean isAvai = employees.stream()
//                .anyMatch(x -> x.getSalary() > 100000);
//
//        System.out.println("Is there any employee with salary more that 1lakh : " + isAvai);

        //13. allMatch()
        //Check whether all employees are older than 18.
//        boolean isAll18Plus = employees.stream()
//                .allMatch(employee -> employee.getAge() > 18);
//
//        System.out.println("Is all employee 18+ : "+ isAll18Plus);

        //14. noneMatch()
        //Check whether no employee has a negative salary.
//        boolean isAnyOneWithNegSal = employees.stream()
//                .noneMatch(employee -> employee.getSalary() < 0);
//
//        System.out.println("Is there no employee with negetive salary : " + isAnyOneWithNegSal);

        //15. 🔥 reduce()
        //Calculate the total salary of all employees.
//        int totalSalary = employees.stream()
//                .map(Employee::getSalary)
//                .reduce(0, Integer::sum);
//
//        System.out.println(totalSalary);

        //💀 Final Boss

//        List<String> names=  employees.stream()
//                .filter(employee -> (employee.getSalary() > 50000 && employee.getDepartment().equals("IT")))
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .map(Employee::getName)
//                .distinct()
//                .collect(toList());
//
//        System.out.println(names);

        Map<String, List<Employee>> groupByDep =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupByDep.forEach((x, y) -> System.out.println(x + " : " + y));

    }
}
