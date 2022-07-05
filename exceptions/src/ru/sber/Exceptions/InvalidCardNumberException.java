package ru.sber.Exceptions;

public class InvalidCardNumberException extends BankOnlineException {
    public InvalidCardNumberException(String message) {
        super(message);
    }
}
