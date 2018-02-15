package com.salesmanager.shop.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
 
@Documented
@Constraint(validatedBy = {EnumValidator.class})
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Enum
{
    public abstract Class<? extends java.lang.Enum<?>> enumClass();
     
    public abstract Class<?>[] groups() default {};
  
    public abstract boolean ignoreCase() default false;
     
    public abstract String message() default "Invalid value. This is not permitted.";
     
    public abstract Class<? extends Payload>[] payload() default {};
}
