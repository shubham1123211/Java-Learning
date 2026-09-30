package MiniProjects.OrderChecker;

@FunctionalInterface
public interface OrderChecker {
    boolean check(Order order);
}