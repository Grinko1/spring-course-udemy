package ru.course.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Star wars")
    private String name;

    public String getName() {
        return name;
    }
}
