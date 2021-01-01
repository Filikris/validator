package ua.pp.kris.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        exemple1("+780636893417");

        example2(45);
    }

    private static void exemple1(String phone) {
        List<ValidatorRule<String>> rules = new ArrayList<>();
        rules.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));
        rules.add(new StartsWithValidatorRule("+38"));
        ObjectValidator<String> validator = new RulesBasedObjectValidator<>(rules);

        try{
            validator.validate(phone);
        }catch (ValidationException e){
            System.out.println("Неверный номер "+e.getMessage());
        }
    }

    private static void example2(Number num) {
        List<ValidatorRule<Number>> rules = new ArrayList<>();
        rules.add(new MaxNumberValidatorRule(10));
        rules.add(new MinNumberValidatorRule(0));

        ObjectValidator<Number> validator = new RulesBasedObjectValidator<>(rules);

        try{
            validator.validate(num);
        }catch (ValidationException e){
            System.out.println("Недопустимое значение "+e.getMessage());
        }
    }
}
