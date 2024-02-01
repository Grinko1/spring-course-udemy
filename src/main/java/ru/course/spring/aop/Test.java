package ru.course.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        LibraryUniver library = context.getBean("libraryUniver", LibraryUniver.class);
        LibrarySchool library2 = context.getBean("librarySchool", LibrarySchool.class);
        Book book = context.getBean("book", Book.class);
//        System.out.println(book.getName());

//        library.getBook();
//        library.getMagazine();
//        library.addMagazine();
//        library.addBook("Nadya",book );
        System.out.println("book is " +library.returnBook());
//        library.returnMagazine();


//        library2.getBook();
        context.close();
        System.out.println("main ends");
    }
}
