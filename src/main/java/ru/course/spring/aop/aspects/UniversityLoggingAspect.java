package ru.course.spring.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.course.spring.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution( * getStudents() )")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("before get students");
        System.out.println("----------------------------------");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void afterReturningStudentsAdvice(List<Student> students) {
        students.add(new Student("James Bond", 7, 0.07));
        System.out.println("after got students " + students);

        System.out.println("----------------------------------");
    }
    @AfterThrowing(pointcut = "execution( * getStudents() )",
                   throwing = "exception")
    public void afterThrowExceptionGetStudentAdvice(Throwable exception){
        System.out.println(" after exception: " + exception  );
        System.out.println("----------------------------------");
    }
    @After("execution( * getStudents() )")
    public void afterGotStudentsAdvice(){
        System.out.println("students was getting, block like finally");
        System.out.println("----------------------------------");
    }
}
