package ru.course.spring.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.course.spring.one_to_many.entities.Department;
import ru.course.spring.one_to_many.entities.Employee;


public class Create {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cnf.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            ******************
//            Department department = new Department("Sales", 300, 2500);
////            Department department = session.get(Department.class, 3);
//            Employee emp1 = new Employee("Aria", "Stark", 1800);
//            Employee emp2 = new Employee("John", "Snow", 1500);
//            Employee emp3 = new Employee("Varis", "Unknown", 2500);
//            Employee emp4 = new Employee("Ramsi", "Bolton", 1500);
//           department.addEmployee(emp1);
//           department.addEmployee(emp2);
//            department.addEmployee(emp3);
//            department.addEmployee(emp4);


//            *********************
//            session.beginTransaction();
//            session.save(department);
            session.getTransaction().commit();
        }


    }
}
