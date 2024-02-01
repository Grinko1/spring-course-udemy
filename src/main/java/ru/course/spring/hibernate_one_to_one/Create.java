package ru.course.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_one_to_one.entities.Details;
import ru.course.spring.hibernate_one_to_one.entities.Employee;

public class Create {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Details.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

//            ******************
            Details detail = new Details("Mayumi", "92345657", "britni@mail.com");
            Employee emp = new Employee("Antony", "Spears", "singers", 900);
            emp.setEmpDetail(detail);

//            *********************
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }


    }
}
