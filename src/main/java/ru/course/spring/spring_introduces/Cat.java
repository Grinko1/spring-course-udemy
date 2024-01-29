package ru.course.spring.spring_introduces;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
