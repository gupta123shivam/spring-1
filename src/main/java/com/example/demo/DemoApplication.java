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

    //    Car car = (Car) context.getBean("car");
    //    System.out.println(car);

    Bike bike = (Bike) context.getBean("bike");
    System.out.println(bike);

    //    Tyre tyre = (Tyre) context.getBean("tyre");
    //    System.out.println(tyre);
  }
}
