package ru.course.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class LibrarySchool extends LibraryAbstract{

    public void getBook() {
        System.out.println("get book in School library");
    }
}
