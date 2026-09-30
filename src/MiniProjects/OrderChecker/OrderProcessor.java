package MiniProjects.OrderChecker;

public class OrderProcessor {

    public static void checkOrder(Order order, OrderChecker checker) {
        boolean result = checker.check(order);

        System.out.println(
                order.getCustomerName() + " → " + result
        );
    }

    static void main(String[] args) {

        Order order1 = new Order(101, "Rahul", 2500);
        Order order2 = new Order(102, "Amit", 700);
        Order order3 = new Order(103, "Priya", 5000);

        OrderChecker expensiveRule =
                order -> order.getAmount() > 2000;

        OrderChecker largeRule =
                order -> order.getAmount() > 4000;

        OrderChecker smallRule =
                order -> order.getAmount() < 1000;

        checkOrder(order1, expensiveRule);
        checkOrder(order2, largeRule);
        checkOrder(order3, smallRule);
    }
}