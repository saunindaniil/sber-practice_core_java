package ru.sber.Exceptions;

public class BlockedCardException extends BankOnlineException {
    public BlockedCardException(String message) {
        super(message);
    }
}
