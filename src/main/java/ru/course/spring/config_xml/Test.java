package ru.course.spring.config_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
//        Dog dog = context.getBean("dog", Dog.class);
//        Dog dog2 = context.getBean("dog", Dog.class);
//        dog2.setName("Bob");
//        System.out.println(dog.getName()+ " "+ dog2.getName());
//        System.out.println(dog +" "+ dog2);

//        System.out.println(person.getSurname() +" " + person.getAge());

        context.close();
    }
}
