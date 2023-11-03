package com.swagger.swagger.entity;

import java.io.Serializable;


@javax.persistence.Entity
@javax.persistence.Table
public class Course implements Serializable{
	
	private static final long serialVersionUID=5857883241528139490L;
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	private int courseId;
	private String courseName;
	private double price;
	public Course(int courseId, String courseName, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + "]";
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
