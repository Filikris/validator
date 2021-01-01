package ua.pp.kris.validator;

public class MinNumberValidatorRule implements ValidatorRule<Number> {

    private Number minValue;

    public MinNumberValidatorRule(Number minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(Number value) {
        return value.doubleValue()>=minValue.doubleValue();
    }

    @Override
    public String errorMessage() {
        return "value less than min: " + minValue;
    }
}
