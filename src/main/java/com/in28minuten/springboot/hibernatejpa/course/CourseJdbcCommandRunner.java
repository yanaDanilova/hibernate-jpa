package com.in28minuten.springboot.hibernatejpa.course;

import com.in28minuten.springboot.hibernatejpa.course.Course;
import com.in28minuten.springboot.hibernatejpa.course.jdbc.CourseJdbcRepository;
import com.in28minuten.springboot.hibernatejpa.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS now","in28minuten"));
        repository.insert(new Course(2,"Learn Azure now","in28minuten"));
        repository.insert(new Course(3,"Learn DevOp now","in28minuten"));
        repository.deleteById(1);
        System.out.println(repository.selectById(2));
        System.out.println(repository.selectById(3));
    }
}
