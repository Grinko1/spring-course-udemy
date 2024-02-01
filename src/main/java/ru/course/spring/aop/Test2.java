package ru.course.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class );
        University university = context.getBean("university", University.class);
        university.addStudent();
        try{
            System.out.println(university.getStudents());
        }catch (Exception e){
            System.out.println("exception in catch " + e);
        }

        context.close();
    }
}
