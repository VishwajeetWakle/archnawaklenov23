package com.swagger.swagger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.swagger.swagger.dao.CourseRepository;
import com.swagger.swagger.entity.Course;
@Service
public class CourseService {
	private CourseRepository repository;
	
	public String saveCourse(Course course) {
		repository.save(course);
		return "saved course with id"+course.getCourseId();	
	}
	
	public List<Course>getAllCourse(){
		return repository.findAll();
		
	}
	public List<Course>deleteCourseById(int courseId){
		repository.deleteById(courseId);
		return repository.findAll();
		
	}
	
}
