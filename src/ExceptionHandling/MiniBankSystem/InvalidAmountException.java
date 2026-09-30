package ExceptionHandling.MiniBankSystem;

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException() {
        super("Invalid Amount Exception");
    }
}
