package MiniProjects.paymentsMe;

public class creditCardPayment extends paymentAbstractClass{


    creditCardPayment(int amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("I'm processing credit card payment");
    }

    public void normalMethod() {
        System.out.println("Extra method");
    }
}
