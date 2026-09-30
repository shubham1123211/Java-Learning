package MiniProjects.paymentsMe;

public abstract class paymentAbstractClass {
    private int amount;

    paymentAbstractClass(int amount) {
        this.amount = amount;
    }

    abstract public void processPayment();

    public void showPaymentDetails(){
        System.out.println("this is the showPaymentMethod");
    }
}
