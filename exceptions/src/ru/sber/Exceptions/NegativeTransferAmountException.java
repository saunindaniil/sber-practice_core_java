package ru.sber.Exceptions;

public class NegativeTransferAmountException extends BankOnlineException {
    public NegativeTransferAmountException(String message) {
        super(message);
    }
}
