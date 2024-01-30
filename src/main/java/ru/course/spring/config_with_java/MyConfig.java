package ru.course.spring.config_with_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ru.course.spring.config_with_java")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    public Person personBean() {
        return new Person(dogBean());
    }
}
