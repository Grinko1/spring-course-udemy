package ru.course.spring.spring_introduces;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Bark");
    }
}
