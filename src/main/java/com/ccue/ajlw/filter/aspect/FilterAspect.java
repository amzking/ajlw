package com.ccue.ajlw.filter.aspect;

import com.ccue.ajlw.filter.anotation.Filter;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

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
        MethodSignature methodSignature = (MethodSignature)signature;
        Method targetMethod = methodSignature.getMethod();
        Filter f = targetMethod.getAnnotation(Filter.class);
        Class clazz = f.value();
        System.out.println(clazz.getName());

    }


}
