package MiniProjects.paymentsMe;

public class upiPayments extends paymentAbstractClass{

    public int amount;

    public upiPayments(int amount) {
        super(amount);
    }
    public void processPayment(){
        System.out.println("I'm processing UPI payment");
    }

    public void normalMethod() {
        System.out.println("This is the normal method");
    }
}
