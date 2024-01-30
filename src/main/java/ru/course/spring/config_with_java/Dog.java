package ru.course.spring.config_with_java;

public class Dog implements Pet{
    public Dog() {
        System.out.println("DogBean was created");
    }

    @Override
    public void say() {
        System.out.println("bark");
    }
}
