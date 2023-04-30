package sashabrausfashion.exceptions;

public class InvalidUserException extends Exception {
    public InvalidUserException(){}
    public InvalidUserException(String message) {
        super(message);
    }

}