package ru.course.spring.spring_introduces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname() +" " + person.getAge());

        context.close();
    }
}
