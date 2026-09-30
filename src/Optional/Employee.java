package Optional;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Employee {
    public String name;
    public int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(
                Arrays.asList(
                        new Employee("Shubham", 24),
                        new Employee("Arjun", 24),
                        new Employee("Karan", 23)
                )
        );


        Optional<Employee>result =  employeeList.stream()
                .filter(x -> x.name.equals("Shubham"))
                        .findAny();

//        String nma =  result.map(x -> x.age).orElse("No Employee Available");
//        System.out.println(nma);








//        Optional<String> employeeName = employees.stream()
//                .filter(x -> x.salary > 80000)
//                .findFirst()
//                .map(x -> x.name);
//
//        System.out.println(employeeName.orElse("No one"));







//        Scanner sc = new Scanner(System.in) ;
//        String value = sc.nextLine();
//        Optional<String> name = Optional.of(value);
//
//            String kai = name.filter(x -> x.length() > 3).orElse("Invalid");
//        System.out.println(kai);
//        System.out.println(name.map(String::toUpperCase).orElse("Default"));


//        try {
//            System.out.println(name.orElseThrow(() -> new Exception("Value is not present")));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        String value = name.orElseGet(() -> {
//            return "Unknown";
//        });
//        System.out.println(value);
    }
}
