package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.assignment")
public class MainApp {
   public static void main(String[] args) {
      SpringApplication.run(MainApp.class, args);
   }
}
