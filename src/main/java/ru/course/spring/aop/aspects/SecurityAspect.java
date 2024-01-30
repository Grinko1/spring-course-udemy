package ru.course.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
    @Before("MyPointcuts.allGetMethods()")
    public void BeforeGetSecurityAdvice(){
        System.out.println("Check security getting methods");
    }
}
