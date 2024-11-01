package com.example.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lr1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Lr1Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Let's calculate discriminant! Please provide values to get result");
        SumAction sumAction = new SumAction();
        System.out.printf("Discriminant: %f", sumAction.getResult());
    }
}
