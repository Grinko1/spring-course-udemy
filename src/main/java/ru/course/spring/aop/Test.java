package ru.course.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        LibraryUniver library = context.getBean("libraryUniver", LibraryUniver.class);
        LibrarySchool library2 = context.getBean("librarySchool", LibrarySchool.class);
//        Book book = context.getBean("book", Book.class);
//        System.out.println(book.getName());

        library.getBook();
        library.getMagazine();
//        library.addMagazine();
//        library.addBook();
//        library.returnBook();
//        library.returnMagazine();


//        library2.getBook();
        context.close();
    }
}
