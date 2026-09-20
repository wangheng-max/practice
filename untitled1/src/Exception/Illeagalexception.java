package Exception;

public class Illeagalexception extends Exception{
    public Illeagalexception() {
    }

    public Illeagalexception(String message) {
        super(message);
    }

    public Illeagalexception(String message, Throwable cause) {
        super(message, cause);
    }

    public Illeagalexception(Throwable cause) {
        super(cause);
    }

    public Illeagalexception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
