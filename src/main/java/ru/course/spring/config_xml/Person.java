package ru.course.spring.config_xml;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }
    public Person() {
    }
    public void callYourPet(){
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
