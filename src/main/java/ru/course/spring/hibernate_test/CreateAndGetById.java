package ru.course.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_test.entity.Employee;

public class CreateAndGetById {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Christofer", "Nolan", "director", 160000);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();


            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println("gotten: " + employee);
        }


    }
}
