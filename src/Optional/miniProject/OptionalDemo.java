package Optional.miniProject;

import javax.swing.text.html.Option;
import java.util.*;


public class OptionalDemo {

    public static Optional<Employee> findEmployee(List<Employee> listOfEmployee, String name) {
        return listOfEmployee.stream()
                .filter(x -> x.getName().equals(name))
                .findAny();
    }


    static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<>(
                Arrays.asList(
                        new Employee("Shubham", Optional.of("abc@gmail.com"), 24, 1000000, "IT"),
                        new Employee("Rahul", Optional.empty(), 25, 50000, "MME")

                )
        );
        Scanner sc = new Scanner(System.in);
        String employeeName = sc.nextLine();
        //I don't know how to print Employee Not present if not present (Explain me)
        Optional<Employee> foundedEmployee = findEmployee(listOfEmployee, employeeName);

        //Using flatMap because we have email as Optional and Employee as well
        if(foundedEmployee.isEmpty()) {
            System.out.println("Employee Not Available");
        }else{
            String showEmail = foundedEmployee.flatMap(Employee::getEmail).orElse("Email Not Available");
            System.out.println("Email address : "+showEmail);
        }

        //First Employee Salary > 80k
        Optional<String> bestEmployee = listOfEmployee.stream()
                .filter(x -> x.getSalary() > 80000)
                .findAny()
                .map(Employee::getName);

        System.out.println("Employee with salary > 80K : "+bestEmployee.orElse("No high-salary employee found"));

        //Find the first employee belonging to IT department
        Optional<Employee> employeeWithIt = listOfEmployee.stream()
                .filter(x -> x.getDepartment().equals("IT"))
                .findFirst();

        if(employeeWithIt.isEmpty()) {
            System.out.println("No Emplyee with IT department");
        }else {
            String emailIdOfThatEmployee = employeeWithIt
                    .flatMap(Employee::getEmail)
                    .orElse("IT employee has no email");
            System.out.println(emailIdOfThatEmployee);
        }

    }
}
