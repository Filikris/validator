package ua.pp.kris.validator;

public interface ObjectValidator<T> {
    void validate(T o) throws ValidationException;
}
