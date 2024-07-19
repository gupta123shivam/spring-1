package com.example.demo;

class Bike implements Vehicle {
  private String brand;

  public void drive() {
    System.out.println("bike is running");
  }

  public String getBrand() {
    return brand;
  }

  public Bike(String brand) {
    super();
    this.brand = brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Bike [brand-" + brand + "]\n";
  }
}
