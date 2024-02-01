package ru.course.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_test.entity.Employee;

public class Delete {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            ********************

//            Employee employee = session.get(Employee.class, 6);
//            session.delete(employee);
            session.createQuery("delete Employee where name = 'Oleg'").executeUpdate();


            //            ********************
            session.getTransaction().commit();
//            System.out.println("gotten: " + employee);
        }


    }
}
