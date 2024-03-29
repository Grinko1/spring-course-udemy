package ru.course.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("MyPointcuts.allAddMethods()")
    public void BeforeAddSecurityAdvice(){
        System.out.println("Check security getting methods");
        System.out.println("----------------------------------");
    }
}
