package MiniProjects.MethodReferences.EmployeeManagementProgram;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class EmployeeManagement {
    static void main(String[] args) {
//      BiFunction<String, Integer, Employee> employeeCreator = (a, b)-> new Employee(a, b);
        BiFunction<String, Integer, Employee> employeeCreator = Employee::new;
        Employee employee1 = employeeCreator.apply("Shubham", 100000);
        Employee employee2 = employeeCreator.apply("Akash", 20000);
        Employee employee3 = employeeCreator.apply("Varun", 10000);

        Function<Employee, String> provideName = Employee::getName;
        Consumer<Employee> provideEmployeeDetails = Employee::getEmployeeDetails;
        Runnable runStaticMethod = Employee::staticMethod;

        System.out.println(provideName.apply(employee1));
//        System.out.println(provideName.apply(employee2));
//        System.out.println(provideName.apply(employee3));

        provideEmployeeDetails.accept(employee1);
        runStaticMethod.run();
    }
}
