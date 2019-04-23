package com.frame.common.base.model.validation.validator;


import com.frame.common.base.model.validation.GaoDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期验证
 *
 * @author qmgf
 */
public class DateValidator implements ConstraintValidator<GaoDate, String> {

    private String format;

    @Override
    public void initialize(GaoDate constraintAnnotation) {
        format = constraintAnnotation.format();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true;
        }
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        try {
            Date date = fmt.parse(value);
            return value.equals(fmt.format(date));
        } catch (ParseException e) {
            return false;
        }
    }

}
