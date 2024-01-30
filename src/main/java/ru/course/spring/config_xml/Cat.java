package ru.course.spring.config_xml;


public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow");
    }
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
