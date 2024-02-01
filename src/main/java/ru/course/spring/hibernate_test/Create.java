package ru.course.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_test.entity.Employee;

public class Create {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Christofer", "Nolan", "director", 210000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        }finally {
            factory.close();
        }


    }
}
