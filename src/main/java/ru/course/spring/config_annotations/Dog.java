package ru.course.spring.config_annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dog implements Pet{
    private String name;

    public Dog() {
        System.out.println("dog was created");
    }

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
    @PostConstruct
    public void init(){
        System.out.println("init dog");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy dog");
    }
}
