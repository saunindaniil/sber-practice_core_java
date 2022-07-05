package ru.sber.Exceptions;

public class OutOfLimitTransferException extends BankOnlineException {
    public OutOfLimitTransferException(String message) {
        super(message);
    }
}
