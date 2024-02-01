package ru.course.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_one_to_one.entities.Details;
import ru.course.spring.hibernate_one_to_one.entities.Employee;

public class Geting {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cnf.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            ******************
            Details details = session.get(Details.class, 6);
            System.out.println(details.getEmployee());
//            Employee emp = session.get(Employee.class, 6);
//            System.out.println(emp);
//            session.delete(emp);

//            *********************


            session.getTransaction().commit();
        }


    }
}
