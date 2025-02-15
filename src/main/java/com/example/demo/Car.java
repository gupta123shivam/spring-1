package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
  @Autowired private Tyre tyre;

  public void drive() {
    System.out.println("car is running");
  }

  @Override
  public String toString() {
    return "Car{" + "tyre=" + tyre + '}';
    //    return "Car";
  }
}
