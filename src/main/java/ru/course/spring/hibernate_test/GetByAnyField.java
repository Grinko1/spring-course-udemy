package ru.course.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_test.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class GetByAnyField {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            ********************

//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList();
            List<Employee> employees = session.createQuery("from Employee " +"where department = 'director' AND salary>200000 ")
                    .getResultList();





            //            ********************
            session.getTransaction().commit();
            System.out.println("gotten: " + employees);
        }


    }
}
