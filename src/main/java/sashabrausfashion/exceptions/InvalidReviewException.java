package sashabrausfashion.exceptions;

public class InvalidReviewException extends Exception {
    public InvalidReviewException(){}
    public InvalidReviewException(String message) {
        super(message);
    }
}
