package ru.course.spring.config_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Pet cat = context.getBean("cat", Cat.class);
//        cat.say();
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.println(person.getName() + " " + person.getAge());;

        context.close();
    }
}
