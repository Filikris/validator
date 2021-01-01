package ua.pp.kris.validator;

public interface ValidatorRule<T> {
    boolean validate(T value);
    String errorMessage();
}
