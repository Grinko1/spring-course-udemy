package ru.course.spring.config_with_java;

public class Cat implements Pet{
    public Cat() {
        System.out.println("CatBean was created");
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
