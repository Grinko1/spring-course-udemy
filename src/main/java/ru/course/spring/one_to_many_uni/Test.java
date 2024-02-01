package ru.course.spring.one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.one_to_many_uni.entities.Department;
import ru.course.spring.one_to_many_uni.entities.Employee;


public class Test {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

//            Department department = new Department("sales", 300, 3000);
//            Employee emp1 = new Employee("Angela", "Strong", 500);
//            Employee emp2 = new Employee("Iris", "Foneverick", 900);
//            department.addEmployee(emp2);
//            department.addEmployee(emp1);



            session.beginTransaction();
//            session.save(department);

            Department dep = session.get(Department.class, 1);
            System.out.println(dep);
            System.out.println(dep.getEmps());







            session.getTransaction().commit();
        }


    }
}
