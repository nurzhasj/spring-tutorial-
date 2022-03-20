package com.example.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
              Student mariam = new Student(
                      "Mariam",
                      "mariam@gmail.com",
                      LocalDate.of(2000, Month.JANUARY, 5)
              );

              Student tanya = new Student(
                    "Tanya",
                    "tanya@gmail.com",
                    LocalDate.of(1980, Month.JULY, 4)
            );

              repository.saveAll(List.of(mariam, tanya));
        };
    }
}
