package ru.course.spring.config_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Pet cat1 = context.getBean("cat", Cat.class);
        Pet cat2 = context.getBean("cat", Cat.class);
        Pet dog1 = context.getBean("dog", Dog.class);
        Pet dog2 = context.getBean("dog", Dog.class);
        System.out.println(cat1+" "+ cat2);
        System.out.println(dog1 +" "+ dog2);
        System.out.println(cat1 == cat2);
        System.out.println(dog1 ==  dog2);


        context.close();
    }
}
