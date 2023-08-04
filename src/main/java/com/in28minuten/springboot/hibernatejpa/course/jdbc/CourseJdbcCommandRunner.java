package com.in28minuten.springboot.hibernatejpa.course.jdbc;

import com.in28minuten.springboot.hibernatejpa.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1,"Learn AWS now","in28minuten"));
        courseJdbcRepository.insert(new Course(2,"Learn Azure now","in28minuten"));
        courseJdbcRepository.insert(new Course(3,"Learn DevOp now","in28minuten"));
        courseJdbcRepository.deleteById(1);
        System.out.println(courseJdbcRepository.selectById(2));
        System.out.println(courseJdbcRepository.selectById(3));
    }
}
