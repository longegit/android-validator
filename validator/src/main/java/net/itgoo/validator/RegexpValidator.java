package net.itgoo.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpValidator extends BaseValidator {

    private String regexp;

    public RegexpValidator(String regexp, String message) {
        super(message);
        this.regexp = regexp;
    }
    
    @Override
    public boolean condition(String value) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

}
