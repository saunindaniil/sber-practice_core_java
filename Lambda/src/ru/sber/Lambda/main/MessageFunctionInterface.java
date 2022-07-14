package ru.sber.Lambda.main;
@FunctionalInterface
public interface MessageFunctionInterface<T> {
    String S = "Message: ";
    T get(String mes);
}