package ru.course.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30 )
public class ExceptionHandlingAspect {
    @Before("MyPointcuts.allAddMethods()")
    public void beforeExceptionAddMethodsAdvice(){
        System.out.println("check exception");
        System.out.println("----------------------------------");
    }
}
