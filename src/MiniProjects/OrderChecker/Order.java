package MiniProjects.OrderChecker;

public class Order {
    private int orderId;
    private String customerName;
    private int amount;

    public Order(int orderId, String customerName, int amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }
}