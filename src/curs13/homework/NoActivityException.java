package curs13.homework;

public class NoActivityException extends RuntimeException{
    private final String activity;

    public NoActivityException(String activity) {
        super("Invalid activity");
        this.activity = activity;
    }
}