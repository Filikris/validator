package ua.pp.kris.validator;

import java.util.List;

public class RulesBasedObjectValidator<T> implements ObjectValidator<T> {

    List<ValidatorRule<T>> rules;

    public RulesBasedObjectValidator(List<ValidatorRule<T>> rules) {
        this.rules = rules;
    }

    @Override
    public void validate(T object) throws ValidationException {
        for (ValidatorRule<T> rule : rules) {
            if(!rule.validate(object)) throw new ValidationException(rule.errorMessage());
        }

    }
}
