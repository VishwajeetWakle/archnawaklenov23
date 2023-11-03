package com.swagger.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagger.swagger.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
