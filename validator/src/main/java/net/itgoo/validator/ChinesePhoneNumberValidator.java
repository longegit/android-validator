package net.itgoo.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ChinesePhoneNumberValidator extends BaseValidator {

    public ChinesePhoneNumberValidator(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected boolean condition(String value) {
        // TODO Auto-generated method stub
        Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9])|(17[0,6-8])|14[57])\\d{8}$");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

}
