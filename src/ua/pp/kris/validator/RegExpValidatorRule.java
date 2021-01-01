package ua.pp.kris.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorRule implements ValidatorRule<String> {

    private Pattern pattern;


    public RegExpValidatorRule(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean validate(String value) {
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    @Override
    public String errorMessage() {
        return "doesn't math pattern: "+ pattern;
    }
}
