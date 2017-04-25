package exceptions;

/**
 * Created by andrew_yashin on 4/25/17.
 */
public class NickNameContainsException extends Exception{
    public NickNameContainsException() {
        super("You cannot use this NickName. Please input other");
    }

    public NickNameContainsException(String message) {
        super(message);
    }
}
