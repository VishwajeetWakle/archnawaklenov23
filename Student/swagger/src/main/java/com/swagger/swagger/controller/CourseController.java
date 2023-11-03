package com.swagger.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swagger.swagger.entity.Course;
import com.swagger.swagger.service.CourseService;
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService service;
	@PostMapping("/save")
	public String saveCourse(@RequestBody Course course) {
		
		return service.saveCourse(course);
		
	}
	@GetMapping("/getCourse")
	public List<Course>getAllCourses(){
		return service.getAllCourse();
		
	}
	@DeleteMapping("/deleteCourse/{courseId}")
	public List<Course>deleteCourseById(@PathVariable int courseId){
		return service.deleteCourseById(courseId);
		
	}
}
