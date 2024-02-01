package ru.course.spring.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.one_to_many.entities.Department;
import ru.course.spring.one_to_many.entities.Employee;

public class Get {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Department dep = session.get(Department.class, 10);


//
            System.out.println(dep);
            System.out.println(dep.getEmps());


//            Employee emp = session.get(Employee.class, 5);
//            session.delete(emp);

//            System.out.println(emp);






            session.getTransaction().commit();
        }


    }
}
