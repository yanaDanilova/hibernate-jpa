package com.in28minuten.springboot.hibernatejpa.course.dataJpa;

import com.in28minuten.springboot.hibernatejpa.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDataJpaRepository extends JpaRepository <Course, Long> {

    List<Course> findByName(String name);
    List<Course> findByAuthor(String author);

}
