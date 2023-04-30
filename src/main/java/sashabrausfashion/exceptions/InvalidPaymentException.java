package sashabrausfashion.exceptions;

public class InvalidPaymentException extends Exception {
    public InvalidPaymentException() {}
    public InvalidPaymentException(String message) {
        super(message);
    }
}
