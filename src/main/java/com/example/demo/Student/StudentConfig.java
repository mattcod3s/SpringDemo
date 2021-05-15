package com.example.demo.Student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
				"John", "johndoe@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21
			);
            Student jane = new Student(
				"Jane", "janeRegan@gmail.com", LocalDate.of(1999, Month.OCTOBER, 18), 21
			);

            repository.saveAll(
               List.of(john, jane)
            );
        };
    }
}
 