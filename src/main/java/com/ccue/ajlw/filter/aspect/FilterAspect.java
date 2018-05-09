package com.ccue.ajlw.filter.aspect;

import com.ccue.ajlw.filter.anotation.Filter;
import com.ccue.ajlw.filter.filtertool.IFilter;
import com.ccue.ajlw.utils.SpringContextUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@Aspect
@Component
public class FilterAspect {


    @Pointcut("@annotation(com.ccue.ajlw.filter.anotation.Filter)")
    private void advice() {
    }

    @Before("@annotation(com.ccue.ajlw.filter.anotation.Filter)")
    public void doBefore(JoinPoint jp) {
        Signature signature = jp.getSignature();
        Object[] objects = jp.getArgs();
        if (objects == null || objects.length == 0 || objects[0] == null) {
            return;
        }
        MethodSignature methodSignature = (MethodSignature)signature;
        Method targetMethod = methodSignature.getMethod();
        Filter f = targetMethod.getAnnotation(Filter.class);
        Class clazz = f.value();
        Class filterClazz = f.filter();
        IFilter filterProcessor = (IFilter) SpringContextUtil.getBean(filterClazz);

        List list = (List) objects[0];
        filterProcessor.filterData(list);



    }


}
