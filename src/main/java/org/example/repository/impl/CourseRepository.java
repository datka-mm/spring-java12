package org.example.repository.impl;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import org.example.entity.Course;
import org.example.repository.Repo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepository implements Repo<Course, Long> {

    @PersistenceContext
    private EntityManagerFactory entityManagerFactory;

    @Override
    public Course save(Course entity) {
        return null;
    }

    @Override
    public Course findById(Long aLong) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public void delete(Course entity) {

    }
}
