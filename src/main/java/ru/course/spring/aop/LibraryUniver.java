package ru.course.spring.aop;


import org.springframework.stereotype.Component;

@Component
public class LibraryUniver extends LibraryAbstract {

    public void getBook() {
        System.out.println("get book  in university library");
    }

    public void getMagazine() {
        System.out.println("get  magazine in university library");
    }

    public void returnBook() {
        System.out.println("return book in university library ");
    }

    public void returnMagazine() {
        System.out.println("return magazine in university library ");
    }
    public void addMagazine() {
        System.out.println("add magazine in university library ");
    }
    public void addBook() {
        System.out.println("add book in university library ");
    }
}
