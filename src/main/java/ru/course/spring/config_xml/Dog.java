package ru.course.spring.config_xml;

import org.springframework.stereotype.Component;

public class Dog implements Pet{
    private String name;
    @Override
    public void say() {
        System.out.println("Bark");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
