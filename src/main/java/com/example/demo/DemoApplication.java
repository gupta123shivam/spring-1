package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {

    //		SpringApplication.run(DemoApplication.class, args);

    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    //    Vehicle obj = (Vehicle) context.getBean("bike");
    //    obj.drive();
    Bike bike = (Bike) context.getBean("bike");
    System.out.println(bike);
  }
}
