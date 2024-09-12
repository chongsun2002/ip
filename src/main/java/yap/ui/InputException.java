package yap.ui;

/**
 * An exception thrown by invalid input to the chatbot.
 */
public class InputException extends Exception {
    public InputException() {
        super("Oops! I'm Sorry, I don't understand this :(");
    }
    public InputException(String message) {
        super(message);
    }
}
