package com.william.utils;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import java.util.Set;

import static com.google.common.collect.Iterables.getFirst;

/**
 *   请求对象参数校验器
 * @author     xinchuang
 * @date       2018/11/28 20:32
 * @version    v1.0
 * @since      @Copyright(c) 爱睿智健康科技(北京)有限公司
 */
public class ValidBeanUtils {

    public static void validBeanParameters(Object o){
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate((Object) o);
        ConstraintViolation<Object> constraintViolation = getFirst(constraintViolations, null);
        if (constraintViolation != null) {
            throw new ValidationException(constraintViolation.getMessage());
        }
    }

}
