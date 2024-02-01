package ru.course.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.hibernate_test.entity.Employee;

import java.util.List;

public class Update {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            ********************


//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(0);
//            employee.setDepartment("student");

            session.createQuery("update Employee set salary=1200 " + "where name = 'Christofer'").executeUpdate();





            //            ********************
            session.getTransaction().commit();
//            System.out.println("gotten: " + employee);
        }


    }
}
