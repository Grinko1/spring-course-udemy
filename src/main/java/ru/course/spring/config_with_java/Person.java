package ru.course.spring.config_with_java;

import org.springframework.beans.factory.annotation.Value;


public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("PersonBean was created");
        this.pet = pet;
    }

    public Person() {
    }

    public void callYourPet() {
        System.out.println("Hey my pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
