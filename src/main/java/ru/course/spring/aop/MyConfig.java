package ru.course.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.course.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
