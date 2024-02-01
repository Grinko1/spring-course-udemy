package ru.course.spring.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.many_to_many.entities.Children;
import ru.course.spring.many_to_many.entities.Section;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class).buildSessionFactory();
             Session session = factory.getCurrentSession();
        ) {

            Section s1 = new Section("Paint");
            Section s2 = new Section("Music");
            Section s3 = new Section("Basketball");
            Section s4 = new Section("Football");
            Section s5 = new Section("Foreign lang");

            Children c1 = new Children("Alena", 7);
            Children c2 = new Children("Mike", 6);
            Children c3 = new Children("Nicolay", 4);
            Children c4 = new Children("Nike", 9);
            Children c5 = new Children("Milana", 5);
            Children c6 = new Children("John", 6);
            Children c7 = new Children("Aria", 7);
            Children c8 = new Children("Robert", 8);
            Children c9 = new Children("Lean", 5);
            Children c10 = new Children("Bob", 8);
//            s1.addChildren(c1);
//            s1.addChildren(c2);
//            s1.addChildren(c3);
//            s1.addChildren(c5);
//            s1.addChildren(c4);
//            c1.addSection(s2);
//            c1.addSection(s3);
//            c1.addSection(s4);
//
//            s2.addChildren(c7);
//            s2.addChildren(c6);
//            s2.addChildren(c8);
//
//            s3.addChildren(c5);
//            s3.addChildren(c4);
//            s3.addChildren(c8);
//            s3.addChildren(c9);
//            s3.addChildren(c10);
//
//            s4.addChildren(c7);
//            s4.addChildren(c8);
//            s4.addChildren(c1);
//
//
            s5.addChildren(c1);
            s5.addChildren(c5);
            s5.addChildren(c7);
            s5.addChildren(c3);
            s5.addChildren(c2);








            session.beginTransaction();
//            session.persist(s5);
            Section section = session.get(Section.class, 11);
            session.delete(section);
//            System.out.println(section);
//            System.out.println(section.getChildren());


            session.getTransaction().commit();


        }
    }
}
