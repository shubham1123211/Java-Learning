package MiniProjects.EmployeePerformanceAnalyser;

public class ScoreAnanlyser {
    @FunctionalInterface
    interface EmployeeEvaluator {
        boolean isEligibleForPromotion(Employee employee);
    }

    public static boolean helper(Employee employee) {
        return employee.getEmployeeScore() >= 85 && employee.getSalary() > 50000;
    }
    static void main(String[] args) {
        Employee employee1 = new Employee("Joe", 85000, 85);

        EmployeeEvaluator ev = (employee)-> helper(employee);

        System.out.println(ev.isEligibleForPromotion(employee1));
    }
}
