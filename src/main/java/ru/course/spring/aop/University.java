package ru.course.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Graice Micho", 3, 7.8);
        Student st2 = new Student("Tim Bert", 5, 8.1);
        Student st3 = new Student("Alex Nigaro", 2, 7.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents()  {

        System.out.println("returning students...");
        System.out.println(students.get(3));
        System.out.println("----------------------------------");
        return students;
    }

}
