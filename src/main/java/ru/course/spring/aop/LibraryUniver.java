package ru.course.spring.aop;


import org.springframework.stereotype.Component;

@Component
public class LibraryUniver extends LibraryAbstract {

    public void getBook() {
        System.out.println("get book  in university library");
        System.out.println("----------------------------------");
    }

    public void getMagazine() {
        System.out.println("get  magazine in university library");
        System.out.println("----------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("return book in university library ");
        return "Star wars";
    }

    public void returnMagazine() {
        System.out.println("return magazine in university library ");
        System.out.println("----------------------------------");
    }

    public void addMagazine() {
        System.out.println("add magazine in university library ");
        System.out.println("----------------------------------");
    }

    public void addBook(String student, Book book) {
        System.out.println("add book in university library ");
        System.out.println("----------------------------------");
    }
}
