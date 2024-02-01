package ru.course.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_one_to_one.entities.Details;
import ru.course.spring.hibernate_one_to_one.entities.Employee;

public class OneToOneBi {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Details.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

//            ******************
            Details detail = new Details("Mayumi", "982374529", "hopkins@mail.com");
            Employee emp = new Employee("Antony", "Hopkins", "actors", 1300);
            emp.setEmpDetail(detail);
            detail.setEmployee(emp);

//            *********************
            session.beginTransaction();
            session.save(detail);
            session.getTransaction().commit();
        }


    }
}
