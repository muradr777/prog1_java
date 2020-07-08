public class NullException extends Exception {
    String message;

    public String getMessage() {
        return this.message;
    }
    public NullException(String message) {
        this.message = message;
    }
}