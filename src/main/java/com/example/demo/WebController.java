package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebController {

  @GetMapping("")
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format("Hola %s!", name);
  }
}
