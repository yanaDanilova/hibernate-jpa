package com.in28minuten.springboot.hibernatejpa.course.jpa;

import com.in28minuten.springboot.hibernatejpa.course.Course;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class CourseJpaRepository {
    @Autowired
   private EntityManager entityManager;


    public void insert(Course course){
        entityManager.merge(course);
    }
    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
    public Course selectById(long id){
        return entityManager.find(Course.class,id);
    }
}
