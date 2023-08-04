package com.in28minuten.springboot.hibernatejpa.course;

import com.in28minuten.springboot.hibernatejpa.course.Course;
import com.in28minuten.springboot.hibernatejpa.course.dataJpa.CourseDataJpaRepository;
import com.in28minuten.springboot.hibernatejpa.course.jdbc.CourseJdbcRepository;
import com.in28minuten.springboot.hibernatejpa.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandRunner implements CommandLineRunner {
//  @Autowired
//  private CourseJdbcRepository repository;

//  @Autowired
//  private CourseJpaRepository repository;
    @Autowired
    private CourseDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1L,"Learn AWS now","in28minuten"));
        repository.save(new Course(2L,"Learn Azure now","in28minuten"));
        repository.save(new Course(3L,"Learn DevOp now","in28minuten"));
        repository.deleteById(1L);
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findByName("Learn Azure now"));
        System.out.println(repository.findByAuthor("in28minuten"));
    }
}
