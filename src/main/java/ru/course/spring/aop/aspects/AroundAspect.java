package ru.course.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {
    @Around("execution( * returnBook(..))")
    public Object aroundReturnBookAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around start");
        Object targetMethodResult = null;

        try {
            targetMethodResult = proceedingJoinPoint.proceed();
            return targetMethodResult;
        } catch (Exception e) {
            System.out.println("around" + e);
            throw e;
        }


    }
}
