package com.ccue.ajlw.filter.anotation;

import com.ccue.ajlw.filter.filtertool.IFilter;
import com.ccue.ajlw.filter.filtertool.impl.FieldFilter;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Filter {

    Class value();

    Class<? extends IFilter> filter();
}
