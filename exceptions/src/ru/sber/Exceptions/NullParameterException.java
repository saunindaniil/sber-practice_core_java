package ru.sber.Exceptions;

public class NullParameterException extends BankOnlineException {
    public NullParameterException(String message) {
        super(message);
    }
}
