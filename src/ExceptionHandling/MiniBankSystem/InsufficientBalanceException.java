package ExceptionHandling.MiniBankSystem;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("InsufficientBalanceException");
    }
}
