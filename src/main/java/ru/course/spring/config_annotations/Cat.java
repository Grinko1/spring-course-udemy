package ru.course.spring.config_annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    public Cat() {
        System.out.println("catBean was created");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }

    @PostConstruct
    public void init() {
        System.out.println("init cat");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy cat");
    }
}
