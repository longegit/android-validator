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
    protected boolean condition(String value) {
        // TODO Auto-generated method stub
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

}
