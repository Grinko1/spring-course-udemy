package ru.course.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Star wars")
    private String name;
    @Value("Dart Wider")
    private String author;
    @Value("1985")
    private int yearOfPublication;


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
